package com.sort.cwk;

/**
 * 快速排序
 * 支持 整数 浮点数（单精度 双精度） 字符 字符串
 * 从大到小 或 从小到大
 * @author cwk
 *
 */

public class QuickSort {
	
	public QuickSort()
	{
		
	}
	/*****************整数快速排序从小到大******************************************************/
	/**
	 * 获取中间值
	 * @param list 整数数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleSmalltoLarge(int[] list, int low, int high)
	{
		int tmp = list[low];
		while(low < high)
		{
			while(low < high && list[high] >= tmp)
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && list[low] <= tmp)
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 整数数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private int[] quickSortSmalltoLarge(int[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleSmalltoLarge(list, low, high);
			list = quickSortSmalltoLarge(list, low, middle -1);
			list = quickSortSmalltoLarge(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 整数从小到大
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] quickSortSmalltoLarge(int[] num)
	{
		if(num.length > 0)
		{
			num = quickSortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************整数快速排序从小到大结束******************************************************/
	/*****************整数快速排序从大到小******************************************************/
	/**
	 * 获取中间值
	 * @param list 整数数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleLargetoSmall(int[] list, int low, int high)
	{
		int tmp = list[low];
		while(low < high)
		{
			while(low < high && list[high] <= tmp)
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && list[low] >= tmp)
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 整数数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private int[] quickSortLargetoSmall(int[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleLargetoSmall(list, low, high);
			list = quickSortLargetoSmall(list, low, middle -1);
			list = quickSortLargetoSmall(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 整数从大到小
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] quickSortLargetoSmall(int[] num)
	{
		if(num.length > 0)
		{
			num = quickSortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************整数快速排序从大到小结束******************************************************/
	
	/*****************浮点数快速排序从小到大******************************************************/
	/**
	 * 获取中间值
	 * @param list 浮点数数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleSmalltoLarge(float[] list, int low, int high)
	{
		float tmp = list[low];
		while(low < high)
		{
			while(low < high && list[high] >= tmp)
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && list[low] <= tmp)
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 浮点数数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private float[] quickSortSmalltoLarge(float[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleSmalltoLarge(list, low, high);
			list = quickSortSmalltoLarge(list, low, middle -1);
			list = quickSortSmalltoLarge(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] quickSortSmalltoLarge(float[] num)
	{
		if(num.length > 0)
		{
			num = quickSortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************浮点数快速排序从小到大结束******************************************************/
	/*****************浮点数快速排序从大到小******************************************************/
	/**
	 * 获取中间值
	 * @param list 浮点数数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleLargetoSmall(float[] list, int low, int high)
	{
		float tmp = list[low];
		while(low < high)
		{
			while(low < high && list[high] <= tmp)
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && list[low] >= tmp)
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 浮点数数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private float[] quickSortLargetoSmall(float[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleLargetoSmall(list, low, high);
			list = quickSortLargetoSmall(list, low, middle -1);
			list = quickSortLargetoSmall(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 浮点数从大到小
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] quickSortLargetoSmall(float[] num)
	{
		if(num.length > 0)
		{
			num = quickSortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************浮点数快速排序从大到小结束******************************************************/
	
	/*****************浮点数快速排序从小到大******************************************************/
	/**
	 * 获取中间值
	 * @param list 浮点数数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleSmalltoLarge(double[] list, int low, int high)
	{
		double tmp = list[low];
		while(low < high)
		{
			while(low < high && list[high] >= tmp)
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && list[low] <= tmp)
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 浮点数数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private double[] quickSortSmalltoLarge(double[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleSmalltoLarge(list, low, high);
			list = quickSortSmalltoLarge(list, low, middle -1);
			list = quickSortSmalltoLarge(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] quickSortSmalltoLarge(double[] num)
	{
		if(num.length > 0)
		{
			num = quickSortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************浮点数快速排序从小到大结束******************************************************/
	/*****************浮点数快速排序从大到小******************************************************/
	/**
	 * 获取中间值
	 * @param list 浮点数数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleLargetoSmall(double[] list, int low, int high)
	{
		double tmp = list[low];
		while(low < high)
		{
			while(low < high && list[high] <= tmp)
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && list[low] >= tmp)
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 浮点数数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private double[] quickSortLargetoSmall(double[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleLargetoSmall(list, low, high);
			list = quickSortLargetoSmall(list, low, middle -1);
			list = quickSortLargetoSmall(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 浮点数从大到小
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] quickSortLargetoSmall(double[] num)
	{
		if(num.length > 0)
		{
			num = quickSortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************浮点数快速排序从大到小结束******************************************************/
	
	/*****************字符快速排序从小到大******************************************************/
	/**
	 * 获取中间值
	 * @param list 字符数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleSmalltoLarge(char[] list, int low, int high)
	{
		char tmp = list[low];
		while(low < high)
		{
			while(low < high && list[high] >= tmp)
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && list[low] <= tmp)
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 字符数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private char[] quickSortSmalltoLarge(char[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleSmalltoLarge(list, low, high);
			list = quickSortSmalltoLarge(list, low, middle -1);
			list = quickSortSmalltoLarge(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 字符从小到大
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] quickSortSmalltoLarge(char[] num)
	{
		if(num.length > 0)
		{
			num = quickSortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************字符快速排序从小到大结束******************************************************/
	/*****************字符快速排序从大到小******************************************************/
	/**
	 * 获取中间值
	 * @param list 字符数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleLargetoSmall(char[] list, int low, int high)
	{
		char tmp = list[low];
		while(low < high)
		{
			while(low < high && list[high] <= tmp)
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && list[low] >= tmp)
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 字符数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private char[] quickSortLargetoSmall(char[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleLargetoSmall(list, low, high);
			list = quickSortLargetoSmall(list, low, middle -1);
			list = quickSortLargetoSmall(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 字符从大到小
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] quickSortLargetoSmall(char[] num)
	{
		if(num.length > 0)
		{
			num = quickSortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************字符快速排序从大到小结束******************************************************/
	
	/*****************字符串快速排序从小到大******************************************************/
	/**
	 * 获取中间值
	 * @param list 字符串数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleSmalltoLarge(String[] list, int low, int high)
	{
		String tmp = list[low];
		while(low < high)
		{
			while(low < high && (list[high].length() > tmp.length() || (list[high].length() == tmp.length() && list[high].compareTo(tmp) >= 0)))
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && (list[low].length() < tmp.length() || (list[low].length() == tmp.length() && list[low].compareTo(tmp) <= 0)))
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 字符串数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private String[] quickSortSmalltoLarge(String[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleSmalltoLarge(list, low, high);
			list = quickSortSmalltoLarge(list, low, middle -1);
			list = quickSortSmalltoLarge(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 字符串从小到大
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] quickSortSmalltoLarge(String[] num)
	{
		if(num.length > 0)
		{
			num = quickSortSmalltoLarge(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************字符串快速排序从小到大结束******************************************************/
	/*****************字符串快速排序从大到小******************************************************/
	/**
	 * 获取中间值
	 * @param list 字符串数组
	 * @param low 开始数组下标
	 * @param high 终止数组下标
	 * @return 返回中值
	 */
	private int getMiddleLargetoSmall(String[] list, int low, int high)
	{
		String tmp = list[low];
		while(low < high)
		{
			while(low < high && (list[high].length() < tmp.length() || (list[high].length() == tmp.length() && list[high].compareTo(tmp) <= 0)))
			{
				high --;
			}
			list[low] = list[high];
			while (low < high && (list[low].length() > tmp.length() || (list[low].length() == tmp.length() && list[low].compareTo(tmp) >= 0)))
			{
				low++;
			}
			list[high] = list[low];
 		}
		list[low] = tmp;
		return low;
	}
	/**
	 * 进行快速排序 
	 * @param list 字符串数组
	 * @param low 数组开始下标
	 * @param high 数组终止下标
	 * @return 排序数组
	 */
	private String[] quickSortLargetoSmall(String[] list, int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddleLargetoSmall(list, low, high);
			list = quickSortLargetoSmall(list, low, middle -1);
			list = quickSortLargetoSmall(list, middle + 1, high);
		}
		return list;
	}
	
	/**
	 * 快速排序 字符串从大到小
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] quickSortLargetoSmall(String[] num)
	{
		if(num.length > 0)
		{
			num = quickSortLargetoSmall(num, 0, num.length - 1);
		}
		return num;
	}
	/*****************字符串快速排序从大到小结束******************************************************/
}
