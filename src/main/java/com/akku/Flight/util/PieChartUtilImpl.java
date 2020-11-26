package com.akku.Flight.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class PieChartUtilImpl implements PieChartUtil {
	
	@Override
	public void createPieChart(String path, List<Object[]> data) {
		DefaultPieDataset dataset = new DefaultPieDataset();
		for (Object[] objects : data) {
			dataset.setValue(objects[0].toString(), Double.valueOf(objects[1].toString()));
		}
		
		JFreeChart chart = ChartFactory.createPieChart3D("Students Score Board", dataset, true, true, true);
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resultChart.jpeg"), chart, 300, 300);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
