//package kar.urals.model;
//
//public class Board {
//
//
//
//    private Figure figure11 = new Figure(" ");
//    private Figure figure12 = new Figure(" ");
//    private Figure figure13 = new Figure(" ");
//    private Figure figure21 = new Figure(" ");
//    private Figure figure22 = new Figure(" ");
//    private Figure figure23 = new Figure(" ");
//    private Figure figure31 = new Figure(" ");
//    private Figure figure32 = new Figure(" ");
//    private Figure figure33 = new Figure(" ");
//
//    private static final int SIZE_FIELD = 3;
//    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];
//
//    public void boardInit(){
//        for (int i = 0; i < figures.length; i++) {
//            for (int j = 0; j < figures[i].length; j++) {
//                figures[i][j] = new Figure(" ");
//            }
//        }
//    }
//
//    public Figure getFigure(int x, int y) {
//        return figures[x][y];
//    }
////    public void printBoard() {
////        System.out.printf("%s|%s|%s\n", figure11.getFigure(), figure12.getFigure(), figure13.getFigure());
////        System.out.println("-----");
////        System.out.printf("%s|%s|%s\n", figure21.getFigure(), figure22.getFigure(), figure23.getFigure());
////        System.out.println("-----");
////        System.out.printf("%s|%s|%s\n", figure31.getFigure(), figure32.getFigure(), figure33.getFigure());
////    }
//}