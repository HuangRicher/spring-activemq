package com.activemq.utils;

import java.util.logging.Logger;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    public Logger getParentLogger() {
    	// TODO Auto-generated method stub
    	return super.getParentLogger();
    }

    /**
     * override determineCurrentLookupKey
     * Title: determineCurrentLookupKey
     * Description: 自动查找datasource
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DBContextHolder.getDbType();
    }

}
