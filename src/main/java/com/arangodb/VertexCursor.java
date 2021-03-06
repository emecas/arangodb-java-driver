package com.arangodb;

import com.arangodb.entity.marker.VertexEntity;

/**
 * @author a-brandt
 */
public class VertexCursor<T> extends BaseCursorProxy<T, VertexEntity<T>> {

	public VertexCursor(DocumentCursorResult<T, VertexEntity<T>> baseCursor) {
		super(baseCursor);
	}
}
