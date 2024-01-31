package Project1;

public class Point {
        private double x;
        private double y;

        // Constructor
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        // Setters
        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        // Getters
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        // Set the coordinates of the point
        public void setPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        // Shift a point by a given amount along the x-axis
        public void shiftX(double n) {
            this.x += n;
        }

        // Shift a point by a given amount along the y-axis
        public void shiftY(double n) {
            this.y += n;
        }

        // Find the distance to point p2
        public double distance(Point p2) {
            double dx = this.x - p2.getX() - this.x;
            double dy = this.y - p2.getY() - this.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        // Rotate the point by a specified (radian) angle around the origin
        public void rotate(double angle) {
            double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
            double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
            this.x = newX;
            this.y = newY;
        }

        // Any other methods you believe to be necessary can be added here

        // Example of a toString method to represent the point as a string

        public String toString() {
            return "(" + x + ", " + y + ")";
        }


}
