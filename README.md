# Thread
Java/Kotlin has a class named ***Thread*** which is used to execute some code off the main thread.To use the ***Thread*** class we need to do 3 things :-
> - To create a new class which is inherting from thread.
>  - Override the run method.
>  - Create a new class of [***MyThread***](app/src/main/java/com/thread/thread/MyThread.kt) class & call its start method.

### NOTE ABOUT THREAD
> After calling start the execution of thread starts. One important note about [***MyThread***](app/src/main/java/com/thread/thread/MyThread.kt) is that as soon as run is finished, the thread is destroyed.

# Worker Thread
When
