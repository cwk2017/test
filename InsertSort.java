package com.sort.cwk;


/**
 * 插入排序
 * 支持 整数 浮点数（单精度 双精度） 字符 字符串
 * 从大到小 或 从小到大
 * @author cwk
 *
 */
public class InsertSort {

	public InsertSort()
	{
		
	}
	/**
	 * 插入排序 整数由小到大排序
	 * @param num 整数数组
	 * @return 排序后的数组
	 */
	public int[] insertSortSmalltoLarge(int num[])
	{
		int temp = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && temp < num[j]; j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
	/**
	 * 插入排序 整数由大到小排序
	 * @param num 整数数组
	 * @return 排序后的数组
	 */
	public int[] insertSortLargetoSmall(int num[])
	{
		int temp = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && temp > num[j]; j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
	
	/**
	 * 插入排序 浮点数由小到大排序
	 * @param num 浮点数数组
	 * @return 排序后的数组
	 */
	public double[] insertSortSmalltoLarge(double num[])
	{
		double temp = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && temp < num[j]; j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
	/**
	 * 插入排序 浮点数由大到小排序
	 * @param num 浮点数数组
	 * @return 排序后的数组
	 */
	public double[] insertSortLargetoSmall(double num[])
	{
		double temp = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && temp > num[j]; j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
	
	/**
	 * 插入排序 浮点数由小到大排序
	 * @param num 浮点数数组
	 * @return 排序后的数组
	 */
	public float[] insertSortSmalltoLarge(float num[])
	{
		float temp = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && temp < num[j]; j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
	/**
	 * 插入排序 浮点数由大到小排序
	 * @param num 浮点数数组
	 * @return 排序后的数组
	 */
	public float[] insertSortLargetoSmall(float num[])
	{
		float temp = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && temp > num[j]; j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
	
	/**
	 * 插入排序 字符由小到大排序
	 * @param num 字符数组
	 * @return 排序后的数组
	 */
	public char[] insertSortSmalltoLarge(char num[])
	{
		char temp = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && temp < num[j]; j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
	/**
	 * 插入排序 字符由大到小排序
	 * @param num 字符数组
	 * @return 排序后的数组
	 */
	public char[] insertSortLargetoSmall(char num[])
	{
		char temp = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && temp > num[j]; j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
	
	
	/**
	 * 插入排序 字符串由小到大排序
	 * @param num 字符串数组
	 * @return 排序后的数组
	 */
	public String[] insertSortSmalltoLarge(String num[])
	{
		String temp = "";
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && (temp.length() < num[j].length() || (temp.length() == num[j].length() && temp.compareTo(num[j]) < 0)); j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
	/**
	 * 插入排序 字符串由大到小排序
	 * @param num 字符串数组
	 * @return 排序后的数组
	 */
	public String[] insertSortLargetoSmall(String num[])
	{
		String temp = "";
		for(int i = 0; i < num.length; i++)
		{
			int j = i - 1;
			temp = num[i];
			for(; j >= 0 && (temp.length() > num[j].length() || (temp.length() == num[j].length() && temp.compareTo(num[j]) > 0)); j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = temp;
		}
		return num;
	}
}
