;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname yasarcanyilmazfinalproject) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f ())))

(define-struct avl (data height left right))

;data is the stored data in avl
;height shows the height of avl tree for selected node
;left and right are parts of avl tree which are also avl tree


;insert: (avl data) -> avl
;inserts given data to avl and make it satify the balance condition.
;Examples
; ... , 3 -> (3) , 5 ->   (3) 
;            / \         /  \
;           /   \       /    \
;                             5
;           
;Template
;(define (insert t d <?)
;  (cond
;    ((empty? t) (make-avl.....)
;    ((<? d (avl-data t))
;     (balance (avl-data t)  ..... (avl-height t) ...... (insert (avl-left t).....(avl-right t)......)
;    (else 
;     (balance (avl-data t)....... (avl-height t) (avl-left t) .... (insert (avl-right t) .......)
(check-expect (insert (list->avl '()) 1 <) (make-avl 1 1 empty empty))
(check-expect (insert (list->avl '(1 2)) 3 <) (make-avl
                                               2
                                               2
                                               (make-avl 1 1 empty empty)
                                               (make-avl 3 1 empty empty)))
(check-expect (insert (insert (list->avl '(1 2 4)) 3 <) 5 <) (make-avl
                                                              2
                                                              3
                                                              (make-avl 1 1 empty empty)
                                                              (make-avl
                                                               4
                                                               2
                                                               (make-avl 3 1 empty empty)
                                                               (make-avl 5 1 empty empty))))
(check-expect (insert (insert (insert (list->avl '(1 2 4)) 3 <) 5 <) 6 <) (make-avl
                                                                           4
                                                                           3
                                                                           (make-avl
                                                                            2
                                                                            2
                                                                            (make-avl 1 1 empty empty)
                                                                            (make-avl 3 1 empty empty))
                                                                           (make-avl
                                                                            5
                                                                            2
                                                                            empty
                                                                            (make-avl 6 1 empty empty))))
(define (insert t d <?)
  (cond
    ((empty? t) (make-avl d 1 empty empty))
    ((<? d (avl-data t))
     (balance (avl-data t) (avl-height t) (insert (avl-left t) d <?) (avl-right t)))
    (else 
     (balance (avl-data t) (avl-height t) (avl-left t) (insert (avl-right t) d <?) ))))

;; balance data number avl avl -> avl
;; d data at current root
;; height at current root
;; purpose: create the new root of the tree, and rebalance it if it does not satift balance condition
;; The examples are taken from courses.cs.bilgi.edu.tr/.......
;; Single rotate
;;
;;           root                           new root
;;            d                                r
;;          /   \                            /   \
;;         /     \                          /     \
;;        l       r           --->         d       rr   
;;               / \                      / \     
;;              /   \                    /   \
;;            lr    rr                  l    lr
;;                 (heavy)
;;
;; Double rotate
;;
;;           root                           new root
;;            d                                lr
;;          /   \                            /    \
;;         /     \                          /      \
;;        l       r           --->         d        r   
;;               / \                      / \      / \
;;              /   \                    /   \    /   \
;;            lr    rr                  l   llr  rlr  rr
;;           /  \
;;          /    \
;;         llr   rlr
;;       (one is heavy)  
;;
;; Left heavy is simply the mirror image of this
;(define (balance d h l r)
;  
;  (cond
      ;;no problem about balancing 
;    ((< (abs (- hl hr)) 2) ........ (make-avl  
;    ((< hl hr)
      ;;right heavy
;     (let* ((lr (avl-left r)) (rr (avl-right r)) (hlr (avl-h lr)) (hrr (avl-h rr)))
;       (if (< hlr hrr)
;           ;; single rotate
;           (make-avl (avl-data r) h (make-avl d (- h 1) l lr) rr) 
;           ;; double rotate
;           (let* ((llr (avl-left lr)) (rlr (avl-right lr)) (hrlr (avl-h rlr)))
;             (make-avl (avl-data lr) h
;                       (make-avl d (- h 1) l llr)
;                       (make-avl (avl-data r) (+ 1 (max hrlr hrr)) rlr rr))))))    
;    (else 
         ;;left heavy   
;     (let* ((rl (avl-right l)) (ll (avl-left l)) (hrl (avl-h rl)) (hll (avl-h ll)))
;       (if (< hrl hll)
;           ;; single rotate
;           (make-avl (avl-data l) h ll (make-avl d (- h 1) rl l)) 
;           ;; double rotate 
;           (let* ((rrl (avl-right rl)) (lrl (avl-left rl)) (hlrl (avl-h lrl)))
;             (make-avl (avl-data rl) h                  
;                       (make-avl (avl-data l) (+ 1 (max hlrl hll)) ll lrl)
;                       (make-avl d (- h 1) rrl r)))))))))

(define (balance d h l r)
  (let* ((hl (avl-h l)) (hr (avl-h r))) 
  (cond
    ((< (abs (- hl hr)) 2) (make-avl d (+ 1 (max hl hr)) l r)) ;;balance ok
    ((< hl hr) 
     ;;right heavy
     (let* ((lr (avl-left r)) (rr (avl-right r)) (hlr (avl-h lr)) (hrr (avl-h rr)))
       (if (< hlr hrr)
           ;; single rotate
           (make-avl (avl-data r) h (make-avl d (- h 1) l lr) rr) 
           ;; double rotate
           (let* ((llr (avl-left lr)) (rlr (avl-right lr)) (hrlr (avl-h rlr)))
             (make-avl (avl-data lr) h
                       (make-avl d (- h 1) l llr)
                       (make-avl (avl-data r) (+ 1 (max hrlr hrr)) rlr rr))))))    
    (else ;;left heavy   
     (let* ((rl (avl-right l)) (ll (avl-left l)) (hrl (avl-h rl)) (hll (avl-h ll)))
       (if (< hrl hll)
           ;; single rotate
           (make-avl (avl-data l) h ll (make-avl d (- h 1) rl l)) 
           ;; double rotate 
           (let* ((rrl (avl-right rl)) (lrl (avl-left rl)) (hlrl (avl-h lrl)))
             (make-avl (avl-data rl) h                  
                       (make-avl (avl-data l) (+ 1 (max hlrl hll)) ll lrl)
                       (make-avl d (- h 1) rrl r)))))))))
;; avl-delete avl x  -> avl
;;takes avl and deletes an object of it and returns deleted version of avl.
;;(define (avl-delete t d <?)
;;  (cond
;;    ((null? t) errror...))  
;;    ((<? d (avl-data t)) 
;;     (balance ......))
;;    ((<? (avl-data t) d)  
;;     (balance ......))  
;;    (else ....) 

(check-expect (avl-delete (make-avl "a" 1 empty empty) "a" string<?) empty) 
(check-expect (avl-delete (make-avl "b" 
                                    2 
                                    (make-avl "a" 1 empty empty)
                                    (make-avl "c" 1 empty empty)) "a" string<?) (make-avl
                                                                                 "b"
                                                                                 2
                                                                                 empty
                                                                                 (make-avl "c" 1 empty empty)))
(check-expect (avl-delete (list->avl '(1 2 4 5)) 1 <)  (make-avl 4 3 (make-avl 2 2 empty empty) (make-avl 5 1 empty empty)))  
(check-expect (avl-delete (list->avl '(1 2 4 5 6 7 8 9)) 6 <) (make-avl
                                                               5
                                                               4
                                                               (make-avl
                                                                2
                                                                2
                                                                (make-avl 1 1 empty empty)
                                                                (make-avl 4 1 empty empty))
                                                               (make-avl
                                                                8
                                                                3
                                                                (make-avl 7 2 empty empty)
                                                                (make-avl 9 1 empty empty))))


(define (avl-delete t d <?)
  (cond
    ((null? t) (begin (display "error") null))  
    ((<? d (avl-data t)) 
     (balance (avl-data t) (avl-height t) (avl-delete (avl-left t) d <?) (avl-right t)))
    ((<? (avl-data t) d)  
     (balance (avl-data t) (avl-height t) (avl-left t) (avl-delete (avl-right t) d <?)))  
    (else (avl-delete-root t)))) 

;; avl-delete-root avl of x -> avl of x
(define (avl-delete-root t)
  (cond
    ((null? (avl-left t)) (avl-right t))
    ((null? (avl-right t)) (avl-left t))
    (else 
     (make-avl (avl-minimum (avl-right t)) (avl-height t)
                (avl-left t)
                (avl-delete-minimum (avl-right t))))))

;; avl-minimum avl of x ->  x
(define (avl-minimum t)
  (cond
    ((null? (avl-left t)) (avl-data t))
    (else (avl-minimum (avl-left t)))))





;; avl-delete-minimum avl of x -> avl of x
(define (avl-delete-minimum t)
  (cond
    ((null? (avl-left t)) (avl-right t)) 
    (else (make-avl (avl-data t) (avl-height t)
                     (avl-delete-minimum (avl-left t))
                     (avl-right t)))))
(check-expect (avl-delete-minimum (make-avl 1 1 empty empty)) empty)
(check-expect (avl-delete-minimum (make-avl 4 3
                        (make-avl
                         2
                         2
                         (make-avl 1 1 empty empty)
                         (make-avl 3 1 empty empty))
                        (make-avl
                         6
                         2
                         (make-avl 5 1 empty empty)
                         (make-avl 7 1 empty empty)))) (make-avl
                                                        4
                                                        3
                                                        (make-avl
                                                         2
                                                         2
                                                         empty
                                                         (make-avl 3 1 empty empty))
                                                        (make-avl
                                                         6
                                                         2
                                                         (make-avl 5 1 empty empty)
                                                         (make-avl 7 1 empty empty))))  



;;Helper Functions

;to built sorted list
(check-expect (lists 10) (list 0 1 2 3 4 5 6 7 8 9))
;number(represent number of member)->list of number

(define (lists a) 
  (build-list a (lambda (x)  x)))  

;to built reverse sprted list
(check-expect (listrs 10) (list 10 9 8 7 6 5 4 3 2 1))

(define (listrs a)
  (cond
    ((equal? 0 a) empty)
    (else
     (cons a (listrs (- a 1))))))

;to built random sorted list
(check-within (listr 10) (list 1 4 2 6 7 9 8 2 10 9) 10)

(define (listr a)
  (build-list a (lambda (x) (random a))))   
;; list->avl list of number -> avl tree of numbers
;; test helper function. Inserts the numbers in order into an AVL tree of numbers
(define (list->avl-raw ln)
  (cond
    ((empty? ln) empty)
    (else (insert (list->avl-raw (rest ln)) (first ln) <))))

(define (list->avl ln) (list->avl-raw(reverse ln)))
;to retrieve height of avl tree
(define (avl-h t)  
  (cond
    ((empty? t) 0)
    (else (avl-height t))))

;Tests
(check-expect (list->avl '(1))(make-avl 1 1 empty empty))
(check-expect (list->avl '(1 2 3 4 5 6 7))(make-avl 4 3
                                                    (make-avl
                                                     2
                                                     2
                                                     (make-avl 1 1 empty empty)
                                                     (make-avl 3 1 empty empty))
                                                    (make-avl
                                                     6
                                                     2
                                                     (make-avl 5 1 empty empty)
                                                     (make-avl 7 1 empty empty)))) 

(check-expect (avl-delete (make-avl "35" 4
                                    (make-avl "32" 3 
                                              (make-avl "31" 1 empty empty)
                                              (make-avl "33" 2 empty 
                                                        (make-avl "34" 1 empty empty))) 
                                    (make-avl "36" 2 empty (make-avl "37" 1 empty empty)))
                          "31" string<?)
              (make-avl "35" 4 
                        (make-avl "33" 3 
                                  (make-avl "32" 2 empty empty)
                                  (make-avl "34" 1 empty empty)) 
                        (make-avl "36" 2 empty
                                  (make-avl "37" 1 empty empty))))


;;Remaining Tests
;Tests for insertion
;(insert (list->avl (lists 10)) 333 <) 
;(insert (list->avl (listrs 10)) -33 <) 
;(insert (list->avl (lists 10)) 50 <) 
;(insert (list->avl (listrs 10)) -33 <)
;Tests for deletion
;(avl-delete (list->avl (lists 10000)) 33 <) 
;(avl-delete (list->avl (listrs 10000)) 330 <) 
;(avl-delete (list->avl (lists 54892)) 54891 <) 
;(avl-delete (list->avl (listrs 48392)) 3230 <)





