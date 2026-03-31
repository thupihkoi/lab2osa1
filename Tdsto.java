ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("tdsto.txt"));
oos.writeObject(new Integer(100));
oos.writeObject(new Integer(100));
oos.close();
