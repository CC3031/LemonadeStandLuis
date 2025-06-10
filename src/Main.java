import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String strCupsSold = JOptionPane.showInputDialog("Enter the number of cups sold: ");
        int cupsSold = Integer.parseInt(strCupsSold);

        String strPricePerCup = JOptionPane.showInputDialog("Enter the price per cup: ");
        float pricePerCup = Float.parseFloat(strPricePerCup);

        String strLemonCostPerBatch = JOptionPane.showInputDialog("Enter the cost of lemons per batch: ");
        float lemonCostPerBatch = Float.parseFloat(strLemonCostPerBatch);

        String strSugarCostPerBatch = JOptionPane.showInputDialog("Enter the cost of sugar per batch: ");
        float sugarCostPerBatch = Float.parseFloat(strSugarCostPerBatch);

        String strCupCostPerBatch = JOptionPane.showInputDialog("Enter the cost of cups per batch: ");
        float cupCostPerBatch = Float.parseFloat(strCupCostPerBatch);

        float totalCost = lemonCostPerBatch + sugarCostPerBatch + cupCostPerBatch;
        float revenue = cupsSold * pricePerCup;
        float profit = revenue - totalCost;

        if (profit > 0) {
            JOptionPane.showMessageDialog(null, "You made a profit!");
        } else if (profit < 0) {
            JOptionPane.showMessageDialog(null, "You lost money!");
        } else {
            JOptionPane.showMessageDialog(null, "You broke even.");
        }

        String oTotalCost = String.format("%.2f", totalCost);
        String oRevenue = String.format("%.2f", revenue);
        String oProfit = String.format("%.2f", profit);

        JOptionPane.showMessageDialog(null,
                "Total cost: $" + oTotalCost + "\n" +
                "Revenue: $" + oRevenue + "\n" +
                "Profit: $" + oProfit
        );
    }
}