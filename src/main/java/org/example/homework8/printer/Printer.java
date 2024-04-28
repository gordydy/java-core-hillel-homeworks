package org.example.homework8.printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else this.tonerLevel = -1;
        this.duplex = duplex;
        pagesPrinted = 0;

    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            tonerLevel += tonerAmount;
            if (tonerLevel > 100)
                return -1;
            else return tonerLevel;

        } else return -1;

    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            double doubleSide = Math.ceil((double) pagesToPrint / 2);
            pagesPrinted += (int) doubleSide;
        } else pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}