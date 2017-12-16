package com.sort.cwk;


/**
 * 选择排序
 * 支持 整数 浮点数（单精度 双精度） 字符 字符串
 * 从大到小 或 从小到大
 * @author cwk
 *
 */

public class SelectSort {

	public SelectSort()
	{
		
	}
	
	/**
	 * 选择排序 整数由小到大排序
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] selectSortSmalltoLarge(int num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			int temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j] < temp)
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
	
	/**
	 * 选择排序 整数由大到小排序
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] selectSortLargetoSmall(int num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			int temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j] > temp)
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
	
	/**
	 * 选择排序 字符由小到大排序
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] selectSortSmalltoLarge(char num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			char temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j] < temp)
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
	
	/**
	 * 选择排序 字符由大到小排序
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] selectSortLargetoSmall(char num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			char temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j] > temp)
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
	
	/**
	 * 选择排序 浮点数由小到大排序
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] selectSortSmalltoLarge(float num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			float temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j] < temp)
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
	
	/**
	 * 选择排序 浮点数由大到小排序
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] selectSortLargetoSmall(float num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			float temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j] > temp)
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
	
	/**
	 * 选择排序 浮点数由小到大排序
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] selectSortSmalltoLarge(double num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			double temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j] < temp)
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
	
	/**
	 * 选择排序 浮点数由大到小排序
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] selectSortLargetoSmall(double num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			double temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j] > temp)
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
	
	/**
	 * 选择排序 字符串由小到大排序
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] selectSortSmalltoLarge(String num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			String temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j].length() < temp.length() || (num[j].length() == temp.length() && num[j].compareTo(temp) < 0))
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
	
	/**
	 * 选择排序 字符串由大到小排序
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] selectSortLargetoSmall(String num[])
	{
		int position = 0;
		for(int i = 0; i < num.length; i++)
		{
			int j = i + 1;
			position = i;
			String temp = num[i];
			for(; j < num.length; j++)
			{
				if(num[j].length() > temp.length() || (num[j].length() == temp.length() && num[j].compareTo(temp) > 0))
				{
					temp = num[j];
					position = j;
				}
			}
			num[position] = num[i];
			num[i] = temp;
		}
		return num;
	}
}
