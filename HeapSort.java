package com.sort.cwk;


/**
 * 堆排序 
 * 支持 整数 浮点数（单精度 双精度） 字符 字符串
 * 从大到小 或 从小到大
 * @author cwk
 *
 */
public class HeapSort {
	
	public HeapSort()
	{
		
	}
	/******************************整数从小到大堆排序************************************************/
	/**
	 * 堆排序 整数从小到大
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] headSortSmalltoLarge(int num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortSmalltoLarge(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 交换数组元素
	 * @param data 整数数组
	 * @param i 交换数组下标
	 * @param j 交换数组下标
	 * @return 交换后数组
	 */
	private int[] swap(int[] data, int i, int j)
	{
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		return data;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private int[] buildMaxHeapSortSmalltoLarge(int[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --) //从最后一个节点到开始
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex] < data[biggerIndex + 1]) //若果右子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k] < data[biggerIndex])  //如果k节点的值小于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************整数从小到大堆排序结束************************************************/
	/******************************整数从大到小堆排序************************************************/
	/**
	 * 堆排序 整数从小到大
	 * @param num 整数数组
	 * @return 排序后数组
	 */
	public int[] heapSortLargetoSmall(int num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortLargetoSmall(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private int[] buildMaxHeapSortLargetoSmall(int[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --)
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex] > data[biggerIndex + 1]) //若果左子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k] > data[biggerIndex])  //如果k节点的值大于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************整数从大到小堆排序结束************************************************/
	
	/******************************浮点数从小到大堆排序************************************************/
	/**
	 * 堆排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] heapSortSmalltoLarge(float num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortSmalltoLarge(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 交换数组元素
	 * @param data 整数数组
	 * @param i 交换数组下标
	 * @param j 交换数组下标
	 * @return 交换后数组
	 */
	private float[] swap(float[] data, int i, int j)
	{
		float temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		return data;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private float[] buildMaxHeapSortSmalltoLarge(float[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --) //从最后一个节点到开始
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex] < data[biggerIndex + 1]) //若果右子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k] < data[biggerIndex])  //如果k节点的值小于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************浮点数从小到大堆排序结束************************************************/
	/******************************浮点数从大到小堆排序************************************************/
	/**
	 * 堆排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public float[] heapSortLargetoSmall(float num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortLargetoSmall(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private float[] buildMaxHeapSortLargetoSmall(float[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --)
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex] > data[biggerIndex + 1]) //若果左子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k] > data[biggerIndex])  //如果k节点的值大于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************浮点数从大到小堆排序结束************************************************/
	
	/******************************浮点数从小到大堆排序************************************************/
	/**
	 * 堆排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] heapSortSmalltoLarge(double num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortSmalltoLarge(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 交换数组元素
	 * @param data 整数数组
	 * @param i 交换数组下标
	 * @param j 交换数组下标
	 * @return 交换后数组
	 */
	private double[] swap(double[] data, int i, int j)
	{
		double temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		return data;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private double[] buildMaxHeapSortSmalltoLarge(double[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --) //从最后一个节点到开始
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex] < data[biggerIndex + 1]) //若果右子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k] < data[biggerIndex])  //如果k节点的值小于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************浮点数从小到大堆排序结束************************************************/
	/******************************浮点数从大到小堆排序************************************************/
	/**
	 * 堆排序 浮点数从小到大
	 * @param num 浮点数数组
	 * @return 排序后数组
	 */
	public double[] heapSortLargetoSmall(double num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortLargetoSmall(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private double[] buildMaxHeapSortLargetoSmall(double[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --)
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex] > data[biggerIndex + 1]) //若果左子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k] > data[biggerIndex])  //如果k节点的值大于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************浮点数从大到小堆排序结束************************************************/
	
	/******************************字符从小到大堆排序************************************************/
	/**
	 * 堆排序 字符从小到大
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] heapSortSmalltoLarge(char num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortSmalltoLarge(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 交换数组元素
	 * @param data 整数数组
	 * @param i 交换数组下标
	 * @param j 交换数组下标
	 * @return 交换后数组
	 */
	private char[] swap(char[] data, int i, int j)
	{
		char temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		return data;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private char[] buildMaxHeapSortSmalltoLarge(char[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --) //从最后一个节点到开始
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex] < data[biggerIndex + 1]) //若果右子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k] < data[biggerIndex])  //如果k节点的值小于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************字符从小到大堆排序结束************************************************/
	/******************************字符从大到小堆排序************************************************/
	/**
	 * 堆排序 字符从小到大
	 * @param num 字符数组
	 * @return 排序后数组
	 */
	public char[] heapSortLargetoSmall(char num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortLargetoSmall(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private char[] buildMaxHeapSortLargetoSmall(char[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --)
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex] > data[biggerIndex + 1]) //若果左子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k] > data[biggerIndex])  //如果k节点的值大于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************字符从大到小堆排序结束************************************************/
	
	/******************************字符串从小到大堆排序************************************************/
	/**
	 * 堆排序 字符串从小到大
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] heapSortSmalltoLarge(String num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortSmalltoLarge(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 交换数组元素
	 * @param data 整数数组
	 * @param i 交换数组下标
	 * @param j 交换数组下标
	 * @return 交换后数组
	 */
	private String[] swap(String[] data, int i, int j)
	{
		String temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		return data;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private String[] buildMaxHeapSortSmalltoLarge(String[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --) //从最后一个节点到开始
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex].length() < data[biggerIndex + 1].length() || 
						(data[biggerIndex].length() == data[biggerIndex + 1].length() && data[biggerIndex].compareTo(data[biggerIndex + 1]) < 0)) //若果右子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k].length() < data[biggerIndex].length() || 
					(data[k].length() == data[biggerIndex].length() && data[k].compareTo(data[biggerIndex]) < 0))  //如果k节点的值小于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************字符串从小到大堆排序结束************************************************/
	/******************************字符串从大到小堆排序************************************************/
	/**
	 * 堆排序 字符串从小到大
	 * @param num 字符串数组
	 * @return 排序后数组
	 */
	public String[] heapSortLargetoSmall(String num[])
	{
		int arrayLength = num.length;
		for(int i = 0; i < arrayLength - 1; i++)
		{
			num = buildMaxHeapSortLargetoSmall(num, num.length - 1 - i);
			num = swap(num, 0, arrayLength - 1 - i);
		}
		return num;
	}
	/**
	 * 建立数组从 0 到 lastIndex建堆
	 * @param data 需排序数组
	 * @param lastIndex 数组下标
	 * @return 交换后数组
	 */
	private String[] buildMaxHeapSortLargetoSmall(String[] data, int lastIndex) 
	{
		for(int i = (lastIndex - 1) / 2; i >= 0; i --)
		{
			int k = i;	//保存正在判断的节点
			while(k * 2 + 1 <= lastIndex) //当前节点存在子节点
			{
				int biggerIndex = 2 * k + 1; //当前节点的做节点的索引
				if(biggerIndex < lastIndex) //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在 
				{
					if(data[biggerIndex].length() > data[biggerIndex + 1].length() || 
						(data[biggerIndex].length() == data[biggerIndex + 1].length() && data[biggerIndex].compareTo(data[biggerIndex + 1]) > 0)) //若果右子节点的值较大 
					{
						biggerIndex++; //biggerIndex总是记录较大子节点的索引  
					}
				}
				if(data[k].length() > data[biggerIndex].length() || 
					(data[k].length() == data[biggerIndex].length() && data[k].compareTo(data[biggerIndex]) > 0))  //如果k节点的值小于其较大的子节点的值
				{
					swap(data, k, biggerIndex);
					k = biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
				}
				else
				{
					break;
				}
			}
		}
		return data;
	}
	/******************************字符从大到小堆排序结束************************************************/
}
