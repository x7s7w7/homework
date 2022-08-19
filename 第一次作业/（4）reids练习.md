- ping

  ```sh
  127.0.0.1:6379> ping
  PONG
  ```

- set/get

  ```sh
  127.0.0.1:6379> set stu1 Tom
  OK
  127.0.0.1:6379> get stu1
  "Tom"
  ```

- mset/mget

  ```sh
  127.0.0.1:6379> mset stu2 Jack stu3 Marry
  OK
  127.0.0.1:6379> mget stu2 stu3
  1) "Jack"
  2) "Marry"
  ```

- keys

  ```sh
  127.0.0.1:6379> keys *
  1) "stu3"
  2) "stu2"
  3) "stu1"
  ```

- del

  ```sh
  127.0.0.1:6379> del stu1
  (integer) 1
  127.0.0.1:6379> keys *
  1) "stu3"
  2) "stu2"
  ```

- setnx

  ```sh
  127.0.0.1:6379> setnx stu2 Jack1
  (integer) 0
  ```

- setex/ttl

  ```sh
  127.0.0.1:6379> setex stu4 100 Nick
  OK
  127.0.0.1:6379> ttl stu4
  (integer) 96
  ```

- hset/hget

  ```sh
  127.0.0.1:6379> hset stu5 name s5
  (integer) 1
  127.0.0.1:6379> hget stu5 name
  "s5"
  ```

- hmget/hmset

  ```sh
  127.0.0.1:6379> hmset stu5 age 12 hobby sing
  OK
  127.0.0.1:6379> hmget stu5 age hobby name
  1) "12"
  2) "sing"
  3) "s5"
  ```

- lpush/lpop

  ```sh
  127.0.0.1:6379> lpush lang english chiese
  (integer) 2
  127.0.0.1:6379> lpop lang
  "chiese"
  ```

- llen

  ```sh
  127.0.0.1:6379> llen lang
  (integer) 1
  ```

- lindex

  ```sh
  127.0.0.1:6379> lindex lang 0
  "english"
  127.0.0.1:6379> lindex lang 1
  (nil)
  ```

- lrange

  ```sh
  127.0.0.1:6379> lpush lang japanese french
  (integer) 3
  127.0.0.1:6379> lrange lang 0 2
  1) "french"
  2) "japanese"
  3) "english"
  ```

- sadd/smembers

  ```sh
  127.0.0.1:6379> sadd numset 1 3 5 7 9 11
  (integer) 6
  127.0.0.1:6379> smembers numset
  1) "1"
  2) "3"
  3) "5"
  4) "7"
  5) "9"
  6) "11"
  ```

- srem

  ```sh
  127.0.0.1:6379> srem numset 1 3
  (integer) 2
  127.0.0.1:6379> smembers numset
  1) "5"
  2) "7"
  3) "9"
  4) "11"
  ```

- sinter

  ```sh
  127.0.0.1:6379> sadd numset2 6 8 10 11
  (integer) 4
  127.0.0.1:6379> sinter numset numset2
  1) "11"
  ```

- zadd

  ```sh
  127.0.0.1:6379> zadd z1 1 a 2 b 3 c
  (integer) 3
  127.0.0.1:6379> zcard z1
  (integer) 3
  ```

- zcount

  ```sh
  127.0.0.1:6379> zcount z1 2 3
  (integer) 2
  ```

- zrank

  ```sh
  127.0.0.1:6379> zrank z1 c
  (integer) 2
  127.0.0.1:6379> zrank z1 b
  (integer) 1
  ```

- zscore

  ```sh
  127.0.0.1:6379> zscore z1 b
  "2"
  ```

  
