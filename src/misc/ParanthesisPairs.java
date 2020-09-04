package misc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ParanthesisPairs {

	private static LinkedList<String> list;
	
	public static LinkedList<String> generateParenthesis(int n) {
		if ( n <= 0)
			return null;          
      list = new LinkedList<String>();
      
      list.add(doGenerate(list, n));
//      doGenerate(list, n);
      return list;
	}


	public static String doGenerate (LinkedList<String> parans, int n) {
	      if (n <= 1)
	        return "()";
	      for (int i = 0 ; i < n; i++) {
//	        parans.add("()" + doGenerate(parans, i-1));
	        parans.add("(" + doGenerate(parans, i-1) + ")");
	      }
//	      return "(" + doGenerate(parans, n-1) + ")";
	      return "()" + doGenerate(parans, n-1);
	      
	    }
	
	public static void main(String[] args)
	{
		
		PrintList(generateParenthesis(2));
		PrintList(generateParenthesis(3));
		
		
	}
	
	
	public static void PrintList(LinkedList<String> parans) {
		Iterator it = parans.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		};
		System.out.println();

	}
	
	
	
	
	
	
	
	
	
	
public void GameOfLife(int[][] board) {
    	
      	if (board == null) {
           return;
        }
    	DoTheThing(0,0,board);
    }
  
  	public void DoTheThing(int row, int col, int[][] board) {
    	if (col >= board[0].length) {
        	col = 0;
          	row += 1;
        }
      	
      	if (row >= board.length) {
          	return;           
        }
      
      	int state = board[row][col];
        int whatToDo = GetNeighbors(row, col, board);
		
      	DoTheThing(row, col+1, board);
      
        if (whatToDo < 2) {
            board[row][col] = 0;
        } else if (whatToDo > 3) {
            board[row][col] = 0;
        } else if ((whatToDo == 3) || (2 <= whatToDo && whatToDo <= 3 && state == 1)) {
            board[row][col] = 1;
        }
    	
      
    }
  
  	public int GetNeighbors(int row, int col, int[][] board) {
    	int count = 0;
      	int rows = board.length;
      	int cols = board[0].length;
      
      	if (row - 1 >= 0 && board[row-1][col] == 1) {
          	count++;
        }
      	if (col - 1 >= 0 && board[row][col-1] == 1) {
          	count++;
        }
      	if (row + 1 < rows && board[row+1][col] == 1) {
          	count++;
        }
      	if (col + 1 < cols && board[row][col+1] == 1) {
          	count++;
        }
      	//Top Left
      	if (row - 1 >= 0 && col - 1 >= 0 && board[row-1][col-1] == 1) {
          	count++;
        }
      	//Bottom Left
      	if (col - 1 >= 0 && row +1 < rows && board[row+1][col-1] == 1) {
          	count++;
        }
      	// Top Right
      	if (row - 1 >= 0 && col+1 < cols && board[row-1][col+1] == 1) {
          	count++;
        }
      	//Bottom Right
      	if (col + 1 < cols && row + 1 < rows && board[row+1][col+1] == 1) {
          	count++;
        }
		
      	return count;
    }
	
	
	
	
	
	
	
	
	
	
}
