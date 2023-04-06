#### session 5 
### Reader Writer Lock Writers Preference
#### Scala

#### Problem Description:
Implement a writers-preference reader-writer lock.
In the reader-writer problem we consider that some threads may read and some may write. We want to prevent more than one thread modifying the shared resource simultaneously and allow for two or more readers to access the shared resource at the same time.
Make sure that if there is a writer thread waiting then it should get access to the resource as soon as possible i.e. as soon as it is available for someone to acquire it.

#### Solution Description:

This repository contains a simple example of using a read-write lock in Scala. The ReadWriteOperation class demonstrates how to implement read and write operations using a WritersPreferenceLock based on the ReentrantReadWriteLock class from the Java concurrency library.

###### How it Works

The ReadWriteOperation class contains two methods, readOperation() and writeOperation(), which simulate reading and writing to a shared resource. The shared resource is represented as a simple list of integers.

The WritersPreferenceLock class is used to ensure that writers have priority over readers. This is achieved by creating a ReentrantReadWriteLock with the fair parameter set to true.

Several threads are created to perform the read and write operations. These threads are started in the DriverMain object. When a thread wants to read or write to the shared resource, it must first acquire the appropriate lock using the methods provided by the WritersPreferenceLock class.

