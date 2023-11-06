package GUI;

import BUS.StatisBUS;
import BUS.StatisBUSImp;
import DTO.StatisDTO;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class StatisticalGUI {

    private StatisBUS statisBUS = null;

    public StatisticalGUI() {
        statisBUS = new StatisBUSImp();
    }

    public void setDataToChart(JPanel jpnItem) {
        ArrayList<StatisDTO> listItem = statisBUS.getListByBorrow();
        if (listItem != null) {
            TaskSeriesCollection ds = new TaskSeriesCollection();
            TaskSeries taskSeries;
            Task task;
            for (StatisDTO item : listItem) {
                taskSeries = new TaskSeries(String.valueOf(item.getBorrow_id()));
                task = new Task(String.valueOf(item.getBorrow_id()), item.getDate_start(), item.getDate_end());
                taskSeries.add(task);
                ds.add(taskSeries);
            }
            JFreeChart chart = ChartFactory.createGanttChart("THỐNG KÊ PHIẾU MƯỢN", "MÃ PHIẾU MƯỢN", "THỜI GIAN", ds);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));
            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();                                                                                                                          
        }
    }
}
