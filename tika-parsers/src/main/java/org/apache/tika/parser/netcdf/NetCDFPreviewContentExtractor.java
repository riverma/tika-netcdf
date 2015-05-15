package org.apache.tika.parser.netcdf;

import ucar.ma2.Range;

/**
 * Created by rverma on 5/7/15.
 */
public class NetCDFPreviewContentExtractor implements NetCDFContentExtractor {
    @Override
    public boolean isContentExtractionEnabled() {
        return true;
    }

    @Override
    public Range getDefaultVariableRange() {
        return Range.ONE;
    }
}
