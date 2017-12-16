package com.sort.cwk;

/**
 * 希尔排序 
 * 支持 整数 浮点数（单精度 双精度） 字符 字符串
 * 从大到小 或 从小到大
 * @author cwk
 *
 */

public class ShellSort {

	public ShellSort()
	{
		
	}
	
	/**
	 * 希尔排序 整数由小到大排序
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] shellSortSmalltoLarge(int num[])
	{
		double lennum = num.length;
		int temp = 0;
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && temp < num[j]; j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
	
	/**
	 * 希尔排序 浮点数由大到小排序
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] shellSortLargetoSmall(double num[])
	{
		double lennum = num.length;
		double temp = 0;
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && temp > num[j]; j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
	
	/**
	 * 希尔排序 浮点数由小到大排序
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] shellSortSmalltoLarge(float num[])
	{
		double lennum = num.length;
		float temp = 0;
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && temp < num[j]; j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
	
	/**
	 * 希尔排序 整数由大到小排序
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public float[] shellSortLargetoSmall(float num[])
	{
		double lennum = num.length;
		float temp = 0;
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && temp > num[j]; j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
	
	/**
	 * 希尔排序 字符由小到大排序
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] shellSortSmalltoLarge(char num[])
	{
		double lennum = num.length;
		char temp = 0;
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && temp < num[j]; j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
	
	/**
	 * 希尔排序 字符由大到小排序
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] shellSortLargetoSmall(char num[])
	{
		double lennum = num.length;
		char temp = 0;
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && temp > num[j]; j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
	
	/**
	 * 希尔排序 字符串由小到大排序
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] shellSortSmalltoLarge(String num[])
	{
		double lennum = num.length;
		String temp = "";
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && (temp.length() < num[j].length() || (temp.length() == num[j].length() && temp.compareTo(num[j]) < 0)); j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
	
	/**
	 * 希尔排序 字符串由大到小排序
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] shellSortLargetoSmall(String num[])
	{
		double lennum = num.length;
		String temp = "";
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && (temp.length() > num[j].length() || (temp.length() == num[j].length() && temp.compareTo(num[j]) > 0)); j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
	
	/**
	 * 希尔排序 浮点数由小到大排序
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] shellSortSmalltoLarge(double num[])
	{
		double lennum = num.length;
		double temp = 0;
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && temp < num[j]; j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
	
	/**
	 * 希尔排序 整数由大到小排序
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] shellSortLargetoSmall(int num[])
	{
		double lennum = num.length;
		int temp = 0;
		while(true)
		{
			lennum = Math.ceil(lennum / 2);
			int len = (int) lennum;
			for(int x = 0; x < len; x++)
			{
				for(int i = x + len; i < num.length; i += len)
				{
					int j = i - len;
					temp = num[i];
					for(; j >= 0 && temp > num[j]; j -= len)
					{
						num[j + len] = num[j];
					}
					num[j + len] = temp;
				}
			}
			if(len == 1)
				break;
		}
		return num;
	}
}
