public class Converter {
    double rateUSD = 78.5;
	double rateEUR = 88.7;
    double rateJPY = 0.75;
    
    Converter(double USD, double EUR, double JPY)
    rateUSD = 1;
	rateEUR = 2;
    rateJPY = 3;

    public static void convert(double rubles, int currency) {
        		// Тело метода
		  if (currency == 1) {
                System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
			} else if (currency == 2) {
				System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
			} else if (currency == 3) {
				System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
			} else {
				System.out.println("Неизвестная валюта");
			} 
		}
    }