package org.junit;

public class Length {
    public static double getLength(String unit1, String unit2, double value) {
        double length = 0;
        switch (unit1) {
            case "mm" -> {
                switch (unit2) {
                    case "cm" -> {
                        length = value * 0.1;
                    }
                    case "dm" -> {
                        length = value * 0.01;
                    }
                    case "m" -> {
                        length = value * 0.001;
                    }
                    case "km" -> {
                        length = value * 0.000001;
                    }
                }
            }
            case "cm" -> {
                switch (unit2) {
                    case "mm" -> {
                        length = value * 10;
                    }
                    case "dm" -> {
                        length = value * 0.1;
                    }
                    case "m" -> {
                        length = value * 0.01;
                    }
                    case "km" -> {
                        length = value * 0.00001;
                    }
                }
            }
            case "dm" -> {
                switch (unit2) {
                    case "mm" -> {
                        length = value * 100;
                    }
                    case "cm" -> {
                        length = value * 10;
                    }
                    case "m" -> {
                        length = value * 0.1;
                    }
                    case "km" -> {
                        length = value * 0.0001;
                    }
                }
            }
            case "m" -> {
                switch (unit2) {
                    case "mm" -> {
                        length = value * 1000;
                    }
                    case "cm" -> {
                        length = value * 100;
                    }
                    case "dm" -> {
                        length = value * 10;
                    }
                    case "km" -> {
                        length = value * 0.001;
                    }
                }
            }
            case "km" -> {
                switch (unit2) {
                    case "mm" -> {
                        length = value * 1000000;
                    }
                    case "cm" -> {
                        length = value * 100000;
                    }
                    case "dm" -> {
                        length = value * 10000;
                    }
                    case "m" -> {
                        length = value * 1000;
                    }
                }
            }
        }
        return length;
    }
}
