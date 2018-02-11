package edu.ubbcluj.set;

import edu.ubbcluj.set.core.analyzer.GridAnalyzer;
import edu.ubbcluj.set.core.generator.GridGenerator;
import edu.ubbcluj.set.model.Grid;

public class Main {
    public static void main(String[] args) {
        GridGenerator gridGenerator = new GridGenerator();
        Grid grid = gridGenerator.generateGrid();
        GridAnalyzer gridAnalyzer = new GridAnalyzer();
        gridAnalyzer.detectSet(grid);
    }
}
