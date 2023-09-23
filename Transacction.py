import mysql.connector

mydb = mysql.connector.connect(
    host = "localhost",
    user = "root",
    password = "Admin@1234",
    port = 3306,
    database = "atm"
)
mycur = mydb.cursor()
def newacc():
    l = []
    l.append(input("Enter Accno:: "))
    l.append(input("Enter Name:: "))
    l.append(input("Enter Emailid:: "))
    l.append(input("Enter Bal:: "))
    par = (l)

    sql = "insert into atm.accountinfo(Accno,Accname,Emailid," \
          "balance) values (%s,%s,%s,%s)"
    mycur.execute(sql,par)
    mydb.commit()

def dep():
    accno = int(input("Enter Accno:: "))
    l = []
    l.append(int(input("Enter Bal:: ")))
    l.append(accno)
    rl = (l)

    sql = "update Atm.accountinfo SET balance = balance +%s where accno = %s"
    mycur.execute(sql,rl)
    mydb.commit()





def menu():
    print("1.New Acc,2.Balcheck,3.Deposit")
    choice = int(input(":: "))
    if choice == 1:
        newacc()
    elif choice == 3:
        dep()

    menu()

menu()
