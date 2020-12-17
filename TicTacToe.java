public class TicTacToe {

    public static void main (String[] args){

        char gameBoard[][] = { {' ', '|', ' ', '|', ' '}, 
                               {'—', '+', '—', '+', '—'},
                               {' ', '|', ' ', '|', ' '},
                               {'—', '+', '—', '+', '—'}, 
                               {' ', '|', ' ', '|', ' '} }; 

        printGameBoard(gameBoard);



        
    }

    public static void printGameBoard(char x[][]) {

        for( char row = 0 ; row < x.length ; row++) { 

            for( char column = 0 ; column < x[row].length ; column++ ) {

                System.out.print( x[row][column] + " ");

            }

            System.out.println();

        }


    }




}