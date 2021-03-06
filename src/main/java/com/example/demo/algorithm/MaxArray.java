package com.example.demo.algorithm;

import java.util.Arrays;

/**
 * n个整数中找出连续m个数加和是最大
 *
 * @author dinghuang123@gmail.com
 * @since 2018/10/26
 */
public class MaxArray {
    public static void main(String[] args) {
        // int[] 数组 asList返回 int[];形式List对象
        Integer[] paras = {133, 445, 6768, 23, 656, 123105, 768, 234,
                787, 6321, 5677, 234, 1445, 3551, 547, 3245, 12357};
        int n = 6;
        //将集合转化为数组
        System.out.println(getArray(paras, n));
    }

    public static <T> String getArray(Integer[] params, int n) {
        // 声明maxs,初始化temp
        Integer[] maxs, temp;
        temp = new Integer[n];
        maxs = new Integer[n];
        int len = params.length;
        for (int i = 0; i < len; i++) {
            if (i + n <= len) {
                // 数组复制 相当于切片
                System.arraycopy(params, i, temp, 0, n);
                if (maxs[0] == null
                        || (maxs[0] != null && (getSum(maxs) < getSum(temp)))) {
                    // 引用相同 不可使用 maxs = temp;
                    // 从temp复制一份给maxs
                    System.arraycopy(temp, 0, maxs, 0, n);
                }
            }
        }
        // 将数组以字符打印
        return Arrays.toString(maxs);
    }

    private static <T> int getSum(T t) {
        //取数组或者集合的加和
        int sum = 0;
        Integer[] temp = (Integer[]) t;
        for (Integer aTemp : temp) {
            sum += aTemp;
        }
        return sum;
    }
}
