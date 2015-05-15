package org.apache.tika.parser.netcdf;

import ucar.ma2.Range;

/**
 * Created by rverma on 5/7/15.
 */
public class NetCDFCustomContentExtractor implements NetCDFContentExtractor {

    private Range range = Range.ONE;

    public NetCDFCustomContentExtractor(Range customRange) {
        range = customRange;
    }

    @Override
    public boolean isContentExtractionEnabled() {
        return true;
    }

    @Override
    public Range getDefaultVariableRange() {
        return range;
    }
}
