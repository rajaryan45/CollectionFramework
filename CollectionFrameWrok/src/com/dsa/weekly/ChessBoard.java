package com.dsa.weekly;

import java.util.concurrent.CountDownLatch;

public class ChessBoard {
	public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
		char val1 = coordinate1.charAt(0);
		char val2 = coordinate2.charAt(0);
		
		int chessVal1 = val1 - 'a' + 1;
		int chessVal2 = val2 - 'a' + 1;
		
		int chessLVal1 = coordinate1.charAt(1)-'0';
		int chessLVal2 = coordinate2.charAt(1)-'0';
		
		int rem1 = (chessLVal1+chessVal1)%2;
		int rem2 = (chessLVal2+chessVal2)%2;
		
		if(rem1 == rem2)
			return true;
		else if(rem1 > 0 && rem2 > 0)
			return true;
		
		return false;
	}
}
