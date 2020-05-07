import sqlite3

def test():
    db = sqlite3.connect(":memory:")
    try:
        c = db.cursor()
        c.execute("SELECT url, hash FROM testDB")
        c.fetchall()

    except Exception as e:
        print("something fake here {}".format(e))
