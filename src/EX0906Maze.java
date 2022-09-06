/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 19:27
 */

/*
老鼠出迷宫，问题求解
 */
public class EX0906Maze {
    public static void main(String[] args) {
        //打印地图
        int[][] map = new int[8][7];
        for (int i = 0; i < map[i].length; i++) {       //地图上下边障碍【错误】不是map.length
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < map.length; i++) {         //地图左右边障碍
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;                              //地图中间障碍
        map[3][2] = 1;

        //创建对象，利用方法寻找出路【【【【【


        for (int i = 0; i < map.length; i++) {         //打印地图
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

class Mouse {
    public void findWay(int[][] map, int i, int j) {

    }
}