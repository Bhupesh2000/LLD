Singleton Design Code - 
1. Private Constructor - The constructor is private so that no other class can instantiate AppSettings directly
2. Singleton Access - The getInstance() method is used to access the single instance of the settings
3. Global Access - Any part of the application can access the settings using AppSettings.getInstance