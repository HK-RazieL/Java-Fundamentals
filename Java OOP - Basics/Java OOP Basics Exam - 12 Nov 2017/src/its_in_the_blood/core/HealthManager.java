package its_in_the_blood.core;

import its_in_the_blood.entity.Cluster;
import its_in_the_blood.entity.Organism;
import its_in_the_blood.entity.cells.Cell;
import its_in_the_blood.entity.cells.blood_cells.RedBloodCell;
import its_in_the_blood.entity.cells.blood_cells.WhiteBloodCell;
import its_in_the_blood.entity.cells.microbes.Bacteria;
import its_in_the_blood.entity.cells.microbes.Fungi;
import its_in_the_blood.entity.cells.microbes.Virus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HealthManager {
    public static Map<String, Organism> organisms = new HashMap<>();

    public static String checkCondition(String organismName) {
        if (organisms.containsKey(organismName)) {
            System.out.printf("Organism - %s\n", organismName);
            System.out.printf("--Clusters: %d\n--Cells: %d\n", organisms.get(organismName).clusters.size(), organisms.get(organismName).totalCells());
            if (organisms.get(organismName).clusters.size() > 0) {
                for (String s : organisms.get(organismName).clusters.keySet()) {
                    System.out.printf("----Cluster %s\n", s);
                    for (Cell cell : organisms.get(organismName).clusters.get(s).cells) {
                        System.out.printf("------Cell %s [%d,%d]\n", cell.getId(), cell.getPositionRow(), cell.getPositionCol());
                        System.out.printf("--------Health: %d | %s\n", cell.getHealth(), cell.toString());
                    }
                }
            }
        }
        return null;
    }

    public static String createOrganism(String name) {
        if (!organisms.containsKey(name)) {
            Organism organism = new Organism(name);
            organisms.put(name, organism);
            System.out.printf("Created organism %s\n", name);
            return null;
        } else {
            System.out.printf("Organism %s already exists\n", name);
            return null;
        }
    }

    public static String addCluster(String organismName, String id, int rows, int cols) {
        if (organisms.containsKey(organismName)) {
            Cluster cluster = new Cluster(id, rows, cols);
            organisms.get(organismName).clusters.put(id, cluster);
            System.out.printf("Organism %s: Created cluster %s\n", organismName, id);
        }
        return null;
    }

    public static String addCell(String organismName, String clusterId, String cellType, String cellId, int health, int positionRow, int positionCol, int additionalProperty) {
        if (organisms.containsKey(organismName) && organisms.get(organismName).clusters.containsKey(clusterId)) {
            Cell cell = null;
            switch (cellType) {
                case "Virus":
                    cell = new Virus(cellId, health, positionRow, positionCol, additionalProperty);
                    organisms.get(organismName).clusters.get(clusterId).cells.add(cell);
                    break;
                case "Fungi":
                    cell = new Fungi(cellId, health, positionRow, positionCol, additionalProperty);
                    organisms.get(organismName).clusters.get(clusterId).cells.add(cell);
                    break;
                case "Bacteria":
                    cell = new Bacteria(cellId, health, positionRow, positionCol, additionalProperty);
                    organisms.get(organismName).clusters.get(clusterId).cells.add(cell);
                    break;
                case "WhiteBloodCell":
                    cell = new WhiteBloodCell(cellId, health, positionRow, positionCol, additionalProperty);
                    organisms.get(organismName).clusters.get(clusterId).cells.add(cell);
                    break;
                case "RedBloodCell":
                    cell = new RedBloodCell(cellId, health, positionRow, positionCol, additionalProperty);
                    organisms.get(organismName).clusters.get(clusterId).cells.add(cell);
                    break;
            }
            System.out.printf("Organism %s: Created cell %s in cluster %s\n", organismName, cellId, clusterId);
        }
        return null;
    }

    public static String activateCluster(String organismName) {
        for (Map.Entry<String, Cluster> s : organisms.get(organismName).clusters.entrySet()) {
            System.out.printf("Organism %s: Activated cluster %s. Cells left: %d\n", organismName, s.getValue().getClusterName(), organisms.get(organismName).clusters.size());
        }

        
        return null;
    }


}
