package com.niloen.spring.data.google.datastore.repository.core;

import com.niloen.spring.data.google.datastore.repository.core.mapping.GoogleDatastoreMappingContext;
import org.springframework.data.keyvalue.core.AbstractKeyValueAdapter;
import org.springframework.data.util.CloseableIterator;

import java.io.Serializable;
import java.util.Map.Entry;

public class GoogleDatastoreKeyValueAdapter extends AbstractKeyValueAdapter {
	public GoogleDatastoreKeyValueAdapter() {
		super(new GoogleDatastoreQueryEngine());
	}

	public Object put(Serializable id, Object item, Serializable keyspace) {
		throw new RuntimeException("Not implemented yet");
	}

	public boolean contains(Serializable id, Serializable keyspace) {
		throw new RuntimeException("Not implemented yet");
	}

	public Object get(Serializable id, Serializable keyspace) {
		throw new RuntimeException("Not implemented yet");
	}

	public Object delete(Serializable id, Serializable keyspace) {
		throw new RuntimeException("Not implemented yet");
	}

	public Iterable<?> getAllOf(Serializable keyspace) {
		throw new RuntimeException("Not implemented yet");
	}

	public CloseableIterator<Entry<Serializable, Object>> entries(Serializable keyspace) {
		throw new RuntimeException("Not implemented yet");
	}

	public void deleteAllOf(Serializable keyspace) {
		throw new RuntimeException("Not implemented yet");

	}

	public void clear() {
		throw new RuntimeException("Not implemented yet");

	}

	public long count(Serializable keyspace) {
		throw new RuntimeException("Not implemented yet");
	}

	public void destroy() throws Exception {
	}
}
