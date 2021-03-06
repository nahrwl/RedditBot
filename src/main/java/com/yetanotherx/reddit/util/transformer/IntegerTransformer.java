package com.yetanotherx.reddit.util.transformer;

import org.apache.commons.collections.Transformer;

/**
 * Apache Commons collection transformer
 * Transforms objects to integers.
 * 
 * @author yetanotherx
 */
public class IntegerTransformer implements Transformer {

    public Object transform(Object o) {
        if( o == null ) {
            return null;
        }
        
        try {
            return Integer.parseInt(o.toString());
        } catch( NumberFormatException e ) {
            return null;
        }
    }
    
}
