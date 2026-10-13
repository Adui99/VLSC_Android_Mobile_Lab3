# Thực hành Lab 3: Student List

## Thông tin sinh viên
- **Họ tên:** Hoàng Khương Duy
- **MSSV:** 2500114656

---

## Giới thiệu bài thực hành
Bài thực hành Lab 3 xây dựng ứng dụng Android hiển thị danh sách sinh viên sử dụng **RecyclerView**, **ListAdapter**, **DiffUtil** và **View Binding**.

### Các tính năng chính:
- Hiển thị danh sách sinh viên gồm Avatar, Họ tên và Mã số sinh viên (MSSV).
- Sử dụng `RecyclerView` kết hợp `ListAdapter` và `DiffUtil` tối ưu hóa hiệu năng render danh sách.
- Khi nhấn chọn một sinh viên trong danh sách sẽ hiển thị `Toast` thông báo sinh viên được chọn.
- Hỗ trợ giao diện Edge-to-Edge tương thích với hệ điều hành Android mới.

---

## Cấu trúc thư mục dự án
```
Lab3aStudentList/
├── app/
│   └── src/
│       └── main/
│           ├── java/vn/edu/vlsc/lab3a/
│           │   ├── adapter/
│           │   │   └── StudentAdapter.kt
│           │   ├── model/
│           │   │   └── Student.kt
│           │   └── MainActivity.kt
│           └── res/
│               ├── layout/
│               │   ├── activity_main.xml
│               │   └── item_student.xml
│               └── values/
├── screenshot.png
└── README.md
```

---

## Ảnh minh chứng

![Ảnh minh chứng](<img width="1920" height="994" alt="image" src="https://github.com/user-attachments/assets/bcfcc9e5-f933-48ce-badd-24cfabe9cb4b" />
)
