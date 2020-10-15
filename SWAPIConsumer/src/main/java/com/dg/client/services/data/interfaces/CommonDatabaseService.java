package com.dg.client.services.data.interfaces;


///All IDs are registered as Guids, generated directly by the JVM
public interface CommonDatabaseService {

    public void beginTransaction();
    public void closeDatabase();

    public void commit();
    public void createTable<T>();

    @SuppressWarnings
    @Override 
    public void delete(object objectToDelete);
    public void delete<T>(String id); 
    public void delete<T>(IEnumerable<Guid> ids);
    public void deleteAll<T>();

    public void dropTable<T>();
    public void execute(string query, params object[] args);

    IEnumerable<PersistentType> Get<PersistentType>(string queryStatement, params object[] queryParameter);
    Task<IEnumerable<PersistentType>> GetAsync<PersistentType>(string query);
    public IEnumerable<PersistentType> GetAll<PersistentType>(string queryStatement) where PersistentType : class, new() => _connection.CreateCommand(queryStatement).ExecuteQuery<PersistentType>().AsEnumerable();
    public IEnumerable<T> GetItems<T>(Func<T, bool> condition);

    public ScalarType GetScalar<ScalarType>(string query) where ScalarType : new();
    public Task<ScalarType> GetScalarAsync<ScalarType>(string query) where ScalarType : new();
    public T GetSingleItem<T>(Func<T, bool> condition) where T : class, new();

    //INSERTS
    public void Insert<T>(T objectToInsert);
    public int InsertItems<T>(IEnumerable<T> items);
    public void InsertOrUpdate<T>(T obj);

    //TRANSACTION MANAGEMENT
    public void Rollback();
    public void RunInTransaction(Action action);
    public void SaveChanges();
    public Task SaveChangesAsync();

    //UPDATE
    public void Update<T>(T objectToUpdate) where T : class, new();
    public void Update<T>(IEnumerable<T> objectsToUpdate) where T : class, new() => _connection.UpdateAll(objectsToUpdate);
    public int UpdateItems<T>(IEnumerable<T> models) => _connection.UpdateAll(models);

    public void InsertOrReplace<T>(T objectToInsert) => _connection.InsertOrReplace(objectToInsert);
    public int InsertOrReplaceItems<T>(IEnumerable<T> items) => _connection.InsertAll(items);    
}
