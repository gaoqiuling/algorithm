package com.itisacat.algo.algorithm;

//一个二位数组，每个元素都可以往上下左右四个方向走，寻找最长递增路径
public class LongestPath {
    static int maxWay = 0;
    static int[][] result = new int[5][5];

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4, 5},
                {2, 5, 4, 3, 2},
                {3, 6, 5, 1, 2},
                {4, 2, 6, 3, 7},
                {5, 3, 5, 6, 8}};
        int[][] visited = new int[5][5];

        longWay(0, 0, 0, nums, visited);
        System.out.println("最长路径：" + maxWay);

    }

    /**
     * 得到最长的路径
     *
     * @param nums
     * @param visited
     */
    private static void longWay(int x, int y, int way, int[][] nums, int[][] visited) {
        int nextx = x + 1;
        int nexty = y + 1;
        int prex = x - 1;
        int prey = y - 1;
        way += 1;
        result[x][y] = nums[x][y];
        visited[x][y] = 1;
        if (maxWay < way) {
            maxWay = way;
        }
        System.out.println(x + "===" + y + "====" + nums[x][y] + "当前次数" + way);
        if (x > 0 && nums[x][y] + 1 == nums[prex][y]) {
            longWay(prex, y, way, nums, visited);
        }
        if (y > 0 && nums[x][y] + 1 == nums[x][prey]) {
            longWay(x, prey, way, nums, visited);
        }
        if (x < nums.length - 1 && nums[x][y] + 1 == nums[nextx][y]) {
            longWay(nextx, y, way, nums, visited);
        }
        if (y < nums.length - 1 && nums[x][y] + 1 == nums[x][nexty]) {
            longWay(x, nexty, way, nums, visited);
        }
        visited[x][y] = 0;
    }

}
