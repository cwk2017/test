package com.sort.cwk;


/**
 * 冒泡排序
 * 支持 整数 浮点数（单精度 双精度） 字符 字符串
 * 从大到小 或 从小到大
 * @author cwk
 *
 */

public class BubbleSort {
	
	public BubbleSort()
	{
		
	}
	
	/**
	 * 冒泡排序 整数从小到大
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] bubbleSortSmalltoLarge(int num[])
	{
		int temp = 0;
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j] > num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	/**
	 * 冒泡排序 整数从大到小
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] bubbleSortLargetoSmall(int num[])
	{
		int temp = 0;
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j] < num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	
	/**
	 * 冒泡排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] bubbleSortSmalltoLarge(float num[])
	{
		float temp = 0;
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j] > num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	/**
	 * 冒泡排序 浮点数从大到小
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] bubbleSortLargetoSmall(float num[])
	{
		float temp = 0;
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j] < num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	
	/**
	 * 冒泡排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] bubbleSortSmalltoLarge(double num[])
	{
		double temp = 0;
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j] > num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	/**
	 * 冒泡排序 浮点数从大到小
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] bubbleSortLargetoSmall(double num[])
	{
		double temp = 0;
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j] < num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	
	/**
	 * 冒泡排序 字符从小到大
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] bubbleSortSmalltoLarge(char num[])
	{
		char temp = 0;
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j] > num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	/**
	 * 冒泡排序 字符从大到小
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] bubbleSortLargetoSmall(char num[])
	{
		char temp = 0;
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j] < num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	
	/**
	 * 冒泡排序 字符串从小到大
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] bubbleSortSmalltoLarge(String num[])
	{
		String temp = "";
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j].length() > num[j + 1].length() || (num[j].length() == num[j + 1].length() && num[j].compareTo(num[j + 1]) > 0))
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	/**
	 * 冒泡排序 字符串从大到小
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] bubbleSortLargetoSmall(String num[])
	{
		String temp = "";
		for(int i = 0; i < num.length - 1; i++)
		{
			for(int j = 0; j < num.length - 1 - i; j++)
			{
				if(num[j].length() < num[j + 1].length() || (num[j].length() == num[j + 1].length() && num[j].compareTo(num[j + 1]) < 0))
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
}
