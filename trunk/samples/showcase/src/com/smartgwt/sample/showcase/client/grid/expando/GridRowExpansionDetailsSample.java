package com.smartgwt.sample.showcase.client.grid.expando;

import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.types.ExpansionMode;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.sample.showcase.client.PanelFactory;
import com.smartgwt.sample.showcase.client.ShowcasePanel;
import com.smartgwt.sample.showcase.client.data.AnimalXmlDS;
import com.smartgwt.sample.showcase.client.data.CountryData;
import com.smartgwt.sample.showcase.client.data.ItemSupplyLocalDS;
import com.smartgwt.sample.showcase.client.data.ItemSupplyXmlDS;

public class GridRowExpansionDetailsSample extends ShowcasePanel {

    private static final String DESCRIPTION =
            "<p>This grid displays a limited number of fields from the supplyItem dataSource.</p>" +
                    "<p>You can expand a row by clicking the special expansionField to see a DetailViewer embedded in the expanded portion of the record which displays the rest of the data from the dataSource that isn't already visible in the grid. </p>";

    public static class Factory implements PanelFactory {
        private String id;

        public Canvas create() {
            GridRowExpansionDetailsSample panel = new GridRowExpansionDetailsSample();
            id = panel.getID();
            return panel;
        }

        public String getID() {
            return id;
        }

        public String getDescription() {
            return DESCRIPTION;
        }
    }

    public Canvas getViewPanel() {
        DataSource dataSource = AnimalXmlDS.getInstance();

        ListGrid listGrid = new ListGrid();
        listGrid.setWidth(600);
        listGrid.setHeight(500);
        listGrid.setCanExpandRecords(true);
        listGrid.setCanSort(true);
        listGrid.setExpansionMode(ExpansionMode.DETAILS);
        listGrid.setAutoFetchData(true);

        listGrid.setDataSource(dataSource);

        ListGridField commonName = new ListGridField("commonName");
        ListGridField scientificName = new ListGridField("scientificName");
        ListGridField lifeSpan = new ListGridField("lifeSpan");

        listGrid.setFields(commonName, scientificName, lifeSpan);

        return listGrid;
    }


    public String getIntro() {
        return DESCRIPTION;
    }    
}
