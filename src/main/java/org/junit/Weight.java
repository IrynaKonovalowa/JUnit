package org.junit;

public class Weight {
    public static double getWeight(String unit1, String unit2, double value) {
        double weight = 0;
        switch (unit1) {
            case "mg" -> {
                switch (unit2) {
                    case "g"-> {
                        weight = value * 0.001;
                    }
                    case "kg"-> {
                        weight = value * 0.000001;
                    }
                    case "t"-> {
                        weight = value * 0.000000001;
                    }
                }
            }
            case "g"->{
                switch (unit2) {
                    case "mg"->{
                        weight = value * 1000;
                    }
                    case "kg"->{
                        weight = value * 0.001;
                    }
                    case "t"->{
                        weight = value * 0.000001;
                    }
                }
            }
            case "kg"->{
                switch (unit2) {
                    case "mg"->{
                        weight = value * 100000;
                    }
                    case "g"->{
                        weight = value * 1000;
                    }
                    case "t"->{
                        weight = value * 0.001;
                    }
                    }
                }
                case "t"->{
                switch (unit2) {
                    case "mg"->{
                        weight = value * 100000000;
                    }
                    case "g"->{
                        weight = value * 100000;
                    }
                    case "kg"->{
                        weight = value * 1000;
                    }
                }
            }
        }
        return weight;
    }
}
