package org.apache.tika.parser.netcdf;

import ucar.ma2.Range;

/**
 * Created by rverma on 5/7/15.
 */
public interface NetCDFContentExtractor {

    boolean isContentExtractionEnabled();
    Range getDefaultVariableRange();

}
