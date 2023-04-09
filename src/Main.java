//El codigo fue hecho con subprogramas, basandome en el material otorgado por el profesor



import edu.princeton.cs.stdlib.StdDraw;
import java.awt.Color;


public class Main{

        //Rango limite de la pantalla
        private static final double MIN = -1.0;
        private static final double MAX = 1.0;

        //ajuste de colores
        private static final Color DEFAULT_COLOR;
        private static final Color[] COLORS_ASSIGNED;
        private static int counter_colors;

        public Main() {
        }

        public static void main(String[] args) {
            StdDraw.enableDoubleBuffering();
            StdDraw.show();
            run();

        }

       //movimiento de las lineas
    public static void run() {
        //Definición del tamaño de la pantalla
        StdDraw.setXscale(MIN,MAX);
        StdDraw.setYscale(MIN,MAX);

        StdDraw.enableDoubleBuffering();

        //Definiendo la posición inicial de las lineas
        //Linea 1
        double x1 = MIN + (MAX - MIN) * Math.random();
        double y1 = MIN + (MAX - MIN) * Math.random();

        double x1b = MIN + (MAX - MIN) * Math.random();
        double y1b = MIN + (MAX - MIN) * Math.random();

        //linea 2
        double x2 = x1 + 0.016;
        double y2 = y1;

        double x2b = x1b + 0.06;
        double y2b = y1b;

        //linea 3
        double x3 = x2 + 0.016;
        double y3 = y2;

        double x3b = x2b + 0.06;
        double y3b = y2b;

        //linea 4
        double x4 = x3 + 0.016;
        double y4 = y3;

        double x4b = x3b + 0.06;
        double y4b = y3b;

        //linea 5
        double x5 = x4 + 0.016;
        double y5 = y4;

        double x5b = x4b + 0.06;
        double y5b = y4b;

        //linea 6
        double x6 = x5 + 0.016;
        double y6 = y5;

        double x6b = x5b + 0.06;
        double y6b = y5b;

        //velocidad de las lineas
        //linea 1
        double vx1 = 0.010;
        double vy1 = 0.010;

        //linea 2
        double vx2 = 0.010;
        double vy2 = 0.010;

        //linea 3
        double vx3 = 0.010;
        double vy3 = 0.010;

        //linea 4
        double vx4 = 0.010;
        double vy4 = 0.010;

        //linea 5
        double vx5 = 0.010;
        double vy5 = 0.010;

        //linea 6
        double vx6 = 0.010;
        double vy6 = 0.010;

        while(true) {

            //linea 1
            if (Math.abs(x1+vx1) > 1.0) {
                vx1 = -vx1;
            }
            if (Math.abs(y1+vy1) > 1.0) {
                vy1 = -vy1;
            }
            if (Math.abs(x1b+vx1) > 1.0) {
                vx1 = -vx1;
            }
            if (Math.abs(y1b+vy1) > 1.0) {
                vy1 = -vy1;
            }
            //linea 2
            if (Math.abs(x2+vx2) > 1.0) {
                vx2 = -vx2;
            }
            if (Math.abs(y2+vy2) > 1.0) {
                vy2 = -vy2;
            }
            if (Math.abs(x2b+vx2) > 1.0) {
                vx2 = -vx2;
            }
            if (Math.abs(y2b+vy2) > 1.0) {
                vy2 = -vy2;
            }
            //linea 3
            if (Math.abs(x3+vx3) > 1.0) {
                vx3 = -vx3;
            }
            if (Math.abs(y3+vy3) > 1.0) {
                vy3 = -vy3;
            }
            if (Math.abs(x3b+vx3) > 1.0) {
                vx3 = -vx3;
            }
            if (Math.abs(y3b+vy3) > 1.0) {
                vy3 = -vy3;
            }
            //linea 4
            if (Math.abs(x4+vx4) > 1.0) {
                vx4 = -vx4;
            }
            if (Math.abs(y4+vy4) > 1.0) {
                vy4 = -vy4;
            }
            if (Math.abs(x4b+vx4) > 1.0) {
                vx4 = -vx4;
            }
            if (Math.abs(y4b+vy4) > 1.0) {
                vy4 = -vy4;
            }
            //linea 5
            if (Math.abs(x5+vx5) > 1.0) {
                vx5 = -vx5;
            }
            if (Math.abs(y5+vy5) > 1.0) {
                vy5 = -vy5;
            }
            if (Math.abs(x5b+vx5) > 1.0) {
                vx5 = -vx5;
            }
            if (Math.abs(y5b+vy5) > 1.0) {
                vy5 = -vy5;
            }
            //linea 6
            if (Math.abs(x6+vx6) > 1.0) {
                vx6 = -vx6;
            }
            if (Math.abs(y6+vy6) > 1.0) {
                vy6 = -vy6;
            }
            if (Math.abs(x6b+vx6) > 1.0) {
                vx6 = -vx6;
            }
            if (Math.abs(y6b+vy6) > 1.0) {
                vy6 = -vy6;
            }

            //actualización de posición
            //linea 1
            x1 += vx1;
            y1 += vy1;

            x1b += vx1;
            y1b += vy1;

            //linea 2
            x2 += vx2;
            y2 += vy2;

            x2b += vx2;
            y2b += vy2;

            //linea3
            x3 += vx3;
            y3 += vy3;

            x3b += vx3;
            y3b += vy3;

            //linea4
            x4 += vx4;
            y4 += vy4;

            x4b += vx4;
            y4b += vy4;

            //linea 5
            x5 += vx5;
            y5 += vy5;

            x5b += vx5;
            y5b += vy5;

            //linea 6
            x6 += vx6;
            y6 += vy6;

            x6b += vx6;
            y6b += vy6;

            //limpiar la pantalla
            StdDraw.clear();

            //linea1
            StdDraw.line(x1,y1,x1b,y1b);
            //linea2
            StdDraw.line(x2,y2,x2b,y2b);
            //linea3
            StdDraw.line(x3,y3,x3b,y3b);
            //linea4
            StdDraw.line(x4,y4,x4b,y4b);
            //linea5
            StdDraw.line(x5,y5,x5b,y5b);
            //linea6
            StdDraw.line(x6,y6,x6b,y6b);


            //mostrar la pantalla
            StdDraw.show();

            StdDraw.pause(10);

        }

    //colores
    }
    static {
            DEFAULT_COLOR = Color.BLACK;
            COLORS_ASSIGNED = new Color[]{Color.RED, Color.BLUE, Color.PINK, Color.GREEN, Color.CYAN, Color.ORANGE};
            counter_colors = 0;
    }



}