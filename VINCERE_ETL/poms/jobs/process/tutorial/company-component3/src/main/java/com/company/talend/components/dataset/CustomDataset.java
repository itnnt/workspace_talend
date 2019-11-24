package com.company.talend.components.dataset;

import java.io.Serializable;

import com.company.talend.components.datastore.CustomDatastore;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.type.DataSet;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@DataSet("CustomDataset")
@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "datastore" }),
    @GridLayout.Row({ "tablename" }),
    @GridLayout.Row({ "data" })
})
@Documentation("TODO fill the documentation for this configuration")
public class CustomDataset implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private CustomDatastore datastore;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String tablename;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String data;

    public CustomDatastore getDatastore() {
        return datastore;
    }

    public CustomDataset setDatastore(CustomDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public String getTablename() {
        return tablename;
    }

    public CustomDataset setTablename(String tablename) {
        this.tablename = tablename;
        return this;
    }

    public String getData() {
        return data;
    }

    public CustomDataset setData(String data) {
        this.data = data;
        return this;
    }
}