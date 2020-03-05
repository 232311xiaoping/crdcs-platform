package com.crdcs.workbench.letcode;

import com.alibaba.fastjson.JSON;

/**
 * @author zxm
 * @version 1.0
 * @since 2020/1/16
 **/
public class LetCode {
    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        Boolean isLine = checkStraightLine(coordinates);
        if (isLine) {
            System.out.println(String.format("%S is a line", JSON.toJSONString(coordinates)));
        } else {
            System.out.println(String.format("%S isn't a line", JSON.toJSONString(coordinates)));
        }
    }

    /**
     * 二维空间的点
     * <p>
     * 如果代码在简洁一点，可扩展到三维空间就更好了
     * <p>
     * 校验较多
     * <p>
     * 空间和时间效率都有待优化
     *
     * @param coordinates
     * @return
     */
    public static Boolean checkStraightLine(int[][] coordinates) {
        //先判断有几个点
        if (coordinates.length < 2 || coordinates.length > 1000) {
            return false;
        }
        //校验每个点是否正确
        for (int[] dot : coordinates) {
            if (dot.length != 2) {
                return false;
            }
        }
        //不能重复
        for (int i = 0; i < coordinates.length; i++) {
            int[] dot = coordinates[i];
            for (int j = i + 1; j < coordinates.length; j++) {
                int[] compareDot = coordinates[j];
                if (compareDot[0] == dot[0] && compareDot[1] != dot[1]) {
                    return false;
                }
            }
        }

        //如果是两个点则肯定是一条直线
        if (coordinates.length == 2) {
            return true;
        }
        return checkStraightLineCore(coordinates);

    }

    public static Boolean checkStraightLineCore(int[][] coordinates) {
        //拿到第一第二个点
        int x = coordinates[0][0] - coordinates[1][0];
        int y = coordinates[0][1] - coordinates[1][1];
        //从第三个点开始校验数据
        for (int i = 2; i < coordinates.length; i++) {
            if ((coordinates[0][0] - coordinates[i][0]) * y != (coordinates[0][1] - coordinates[i][1]) * x) {
                return false;
            }
        }
        return true;
    }

}
