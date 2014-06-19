package com.emercy.change;

public class Ltu
{
	// filename1��ʾԭ�ļ���filename2��ʾĿ���ļ���
	public native void convert(String filename1, String filename2);

	static
	{
		System.loadLibrary("LowerToUpper");
	}
}
