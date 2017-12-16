package com.sort.cwk;

/**
 * 归并排序
 * 支持 整数 浮点数（单精度 双精度） 字符 字符串
 * 从大到小 或 从小到大
 * @author cwk
 *
 */


public class MergeSort {

	public MergeSort()
	{
		
	}
	
	/*********************归并排序整数从小到大***************************************************************/
	/**
	 * 归并排序 整数从小到大
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] mergeSortSmalltoLarge(int[] num)
	{
		if(num.length > 0)
		{
			num = sortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 整数数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private int[] sortSmalltoLarge(int[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortSmalltoLarge(data, left, center);
			data = sortSmalltoLarge(data, center + 1, right);
			data = mergeSmalltoLarge(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 整数数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private int[] mergeSmalltoLarge(int[] data, int left, int center, int right)
	{
		int[] tmpArr = new int[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left] <= data[mid])
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序整数从小到大结束***************************************************************/
	/*********************归并排序整数从大到小***************************************************************/
	/**
	 * 归并排序 整数从小到大
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] mergeSortLargetoSmall(int[] num)
	{
		if(num.length > 0)
		{
			num = sortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 整数数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private int[] sortLargetoSmall(int[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortLargetoSmall(data, left, center);
			data = sortLargetoSmall(data, center + 1, right);
			data = mergeLargetoSmall(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 整数数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private int[] mergeLargetoSmall(int[] data, int left, int center, int right)
	{
		int[] tmpArr = new int[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left] >= data[mid])
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序整数从大到小结束***************************************************************/
	
	/*********************归并排序浮点数从小到大***************************************************************/
	/**
	 * 归并排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] mergeSortSmalltoLarge(float[] num)
	{
		if(num.length > 0)
		{
			num = sortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 浮点数数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private float[] sortSmalltoLarge(float[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortSmalltoLarge(data, left, center);
			data = sortSmalltoLarge(data, center + 1, right);
			data = mergeSmalltoLarge(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 浮点数数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private float[] mergeSmalltoLarge(float[] data, int left, int center, int right)
	{
		float[] tmpArr = new float[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left] <= data[mid])
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序浮点数从小到大结束***************************************************************/
	/*********************归并排序浮点数从大到小***************************************************************/
	/**
	 * 归并排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] mergeSortLargetoSmall(float[] num)
	{
		if(num.length > 0)
		{
			num = sortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 浮点数数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private float[] sortLargetoSmall(float[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortLargetoSmall(data, left, center);
			data = sortLargetoSmall(data, center + 1, right);
			data = mergeLargetoSmall(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 浮点数数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private float[] mergeLargetoSmall(float[] data, int left, int center, int right)
	{
		float[] tmpArr = new float[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left] >= data[mid])
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序浮点数从大到小结束***************************************************************/
	
	/*********************归并排序浮点数从小到大***************************************************************/
	/**
	 * 归并排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] mergeSortSmalltoLarge(double[] num)
	{
		if(num.length > 0)
		{
			num = sortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 浮点数数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private double[] sortSmalltoLarge(double[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortSmalltoLarge(data, left, center);
			data = sortSmalltoLarge(data, center + 1, right);
			data = mergeSmalltoLarge(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 浮点数数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private double[] mergeSmalltoLarge(double[] data, int left, int center, int right)
	{
		double[] tmpArr = new double[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left] <= data[mid])
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序浮点数从小到大结束***************************************************************/
	/*********************归并排序浮点数从大到小***************************************************************/
	/**
	 * 归并排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] mergeSortLargetoSmall(double[] num)
	{
		if(num.length > 0)
		{
			num = sortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 浮点数数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private double[] sortLargetoSmall(double[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortLargetoSmall(data, left, center);
			data = sortLargetoSmall(data, center + 1, right);
			data = mergeLargetoSmall(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 浮点数数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private double[] mergeLargetoSmall(double[] data, int left, int center, int right)
	{
		double[] tmpArr = new double[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left] >= data[mid])
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序浮点数从大到小结束***************************************************************/
	
	/*********************归并排序字符从小到大***************************************************************/
	/**
	 * 归并排序 字符从小到大
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] mergeSortSmalltoLarge(char[] num)
	{
		if(num.length > 0)
		{
			num = sortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 字符数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private char[] sortSmalltoLarge(char[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortSmalltoLarge(data, left, center);
			data = sortSmalltoLarge(data, center + 1, right);
			data = mergeSmalltoLarge(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 字符数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private char[] mergeSmalltoLarge(char[] data, int left, int center, int right)
	{
		char[] tmpArr = new char[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left] <= data[mid])
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序字符从小到大结束***************************************************************/
	/*********************归并排序字符从大到小***************************************************************/
	/**
	 * 归并排序 字符从小到大
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] mergeSortLargetoSmall(char[] num)
	{
		if(num.length > 0)
		{
			num = sortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 字符数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private char[] sortLargetoSmall(char[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortLargetoSmall(data, left, center);
			data = sortLargetoSmall(data, center + 1, right);
			data = mergeLargetoSmall(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 字符数数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private char[] mergeLargetoSmall(char[] data, int left, int center, int right)
	{
		char[] tmpArr = new char[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left] >= data[mid])
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序字符从大到小结束***************************************************************/
	
	/*********************归并排序字符串从小到大***************************************************************/
	/**
	 * 归并排序 字符串从小到大
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] mergeSortSmalltoLarge(String[] num)
	{
		if(num.length > 0)
		{
			num = sortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 字符串数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private String[] sortSmalltoLarge(String[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortSmalltoLarge(data, left, center);
			data = sortSmalltoLarge(data, center + 1, right);
			data = mergeSmalltoLarge(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 字符串数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private String[] mergeSmalltoLarge(String[] data, int left, int center, int right)
	{
		String[] tmpArr = new String[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left].length() < data[mid].length() || (data[left].length() == data[mid].length() && data[left].compareTo(data[mid]) <= 0))
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序字符串从小到大结束***************************************************************/
	/*********************归并排序字符串从大到小***************************************************************/
	/**
	 * 归并排序 字符串从小到大
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] mergeSortLargetoSmall(String[] num)
	{
		if(num.length > 0)
		{
			num = sortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/**
	 * 一分为二 归并排序
	 * @param data 字符串数组
	 * @param left 数组起始下标
	 * @param right 数组终止下标
	 * @return 排序后数组
	 */
	private String[] sortLargetoSmall(String[] data, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right) / 2;
			data = sortLargetoSmall(data, left, center);
			data = sortLargetoSmall(data, center + 1, right);
			data = mergeLargetoSmall(data, left, center, right);
		}
		return data;
	}
	
	/**
	 * 归并排序
	 * @param data 字符串数数组
	 * @param left 数组起始下标
	 * @param center 数组中间下标
	 * @param right 数组终止下标
	 * @return 部分排序后数组
	 */
	private String[] mergeLargetoSmall(String[] data, int left, int center, int right)
	{
		String[] tmpArr = new String[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		
		while(left <= center && mid <= right)
		{
			if(data[left].length() > data[mid].length() || (data[left].length() == data[mid].length() && data[left].compareTo(data[mid]) >= 0))
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		while(mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while(left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		while(tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
		}
		return data;
	}
	/*********************归并排序字符串从大到小结束***************************************************************/
}