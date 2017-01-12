package mil.nga.giat.geowave.datastore.cassandra.index.secondary;

import java.util.List;

import mil.nga.giat.geowave.core.index.ByteArrayId;
import mil.nga.giat.geowave.core.store.CloseableIterator;
import mil.nga.giat.geowave.core.store.DataStore;
import mil.nga.giat.geowave.core.store.adapter.DataAdapter;
import mil.nga.giat.geowave.core.store.base.DataStoreEntryInfo.FieldInfo;
import mil.nga.giat.geowave.core.store.index.PrimaryIndex;
import mil.nga.giat.geowave.core.store.index.SecondaryIndex;
import mil.nga.giat.geowave.core.store.index.SecondaryIndexDataStore;
import mil.nga.giat.geowave.core.store.query.DistributableQuery;

public class CassandraSecondaryIndexDataStore implements SecondaryIndexDataStore
{

	@Override
	public void setDataStore(
			DataStore dataStore ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storeJoinEntry(
			ByteArrayId secondaryIndexId,
			ByteArrayId indexedAttributeValue,
			ByteArrayId adapterId,
			ByteArrayId indexedAttributeFieldId,
			ByteArrayId primaryIndexId,
			ByteArrayId primaryIndexRowId,
			ByteArrayId attributeVisibility ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storeEntry(
			ByteArrayId secondaryIndexId,
			ByteArrayId indexedAttributeValue,
			ByteArrayId adapterId,
			ByteArrayId indexedAttributeFieldId,
			ByteArrayId dataId,
			ByteArrayId attributeVisibility,
			List<FieldInfo<?>> attributes ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> CloseableIterator<T> query(
			SecondaryIndex<T> secondaryIndex,
			ByteArrayId indexedAttributeFieldId,
			DataAdapter<T> adapter,
			PrimaryIndex primaryIndex,
			DistributableQuery query,
			String... authorizations ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteJoinEntry(
			ByteArrayId secondaryIndexId,
			ByteArrayId indexedAttributeValue,
			ByteArrayId adapterId,
			ByteArrayId indexedAttributeFieldId,
			ByteArrayId primaryIndexId,
			ByteArrayId primaryIndexRowId ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEntry(
			ByteArrayId secondaryIndexId,
			ByteArrayId indexedAttributeValue,
			ByteArrayId adapterId,
			ByteArrayId indexedAttributeFieldId,
			ByteArrayId dataId,
			List<FieldInfo<?>> attributes ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}

}
