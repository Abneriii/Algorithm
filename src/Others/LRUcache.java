package Others;

/**
 * Author:
 * Created at:2022/8/15
 * Updated at:
 *
 *
 *
 * 146. LRU 缓存
 *
        **Your LRUCache object will be instantiated and called as such:
        **LRUCache obj=new LRUCache(capacity);
        **int param_1=obj.get(key);
        **obj.put(key,value);
 *
 *
 *
 **/
public class LRUcache {


    /**
     *

     *
     *
     *2022.8.18----Hou--写出了算法，但是其实有误，这个方法hashmap中key和value,双向链表只保持了key。因为这样的时间复杂度O是(n),
     *  * 首先应该回答：选用什么数据结构？为什么用hashmap和双向链表。双向链表中存放key，
     * hashmap保证快速定位元素是否存在，双向链表保证元素的O（1）插入和删除
     *
     *
     *
     */
    static class LRUCache {

        /**
         *
         * ------------------------
         * int this.capacity=capacity
         * 初始化capacity个节点组成的双向链表，
         *-------------------------
         *
         * @param capacity
         */
        public  LRUCache(int capacity) {

        }

        /**
         *HouAlgo----------------
         *if hashmap.contains(key)
         *    在链表中找到元key，并将它移动至链表头部
         *    return hashmap.get(key)
         * else
         *    return-1
         *
         *
         *
         * HouAlgo/-----------------
         *
         * @param key
         * @return
         */
        public static int get(int key) {
            return 0;
        }

        /**
         * ---------
         *
         *
         * HouAlgo-------------------------------
         * if hashmap.contains(key)
         *    if(hashmap.get(key)!=value)
         *       hashmap.put(key,value)
         *    在双向链表中将这个key移到链表头
         *
         * else
         *    if  满
         *        删去双向链表的尾部节点，并拿到这个key值，删除掉hashmap中这个key值
         *        在头部加入节点
         *
         *    else 没满
         *       hashmap.put(key,value)
         *       在双向链表的头部插入这个key
         *
         * HouAlgo/-------------------------------
         *
         *
         * @param key
         * @param value
         */
        public static void put(int key, int value) {

        }
    }


}
