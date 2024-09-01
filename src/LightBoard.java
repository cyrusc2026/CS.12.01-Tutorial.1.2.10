public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        this.lights = new boolean[numRows][numCols];
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                double rand = Math.random();
                if (rand < 0.4){
                    this.lights[i][j] = true;
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col) {
        int columnCount = 0;
        for (int row = 0; row < lights.length; row++){
            if (lights[row][col]){
                columnCount++;
            }
        }
        if (lights[row][col]){
            if(columnCount % 2 == 0) return false;
            else return lights[row][col];
        }
        else if (columnCount % 3 == 0) return true;
        else return lights[row][col];
    }

    public boolean[][] getLights() {
        return lights;
    }

    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }
}
