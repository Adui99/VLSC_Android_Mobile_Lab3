# Thực hành Lab 3a: Student List

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

<img width="1920" height="994" alt="image" src="https://github.com/user-attachments/assets/e424e849-c591-4a7b-a886-2447b938c66d" />

# Thực hành lab 3b

## Giới thiệu bài thực hành
Bài thực hành mở rộng từ Lab 3a, thực hiện điều hướng từ danh sách sinh viên (`MainActivity`) sang màn hình chi tiết (`DetailActivity`) thông qua **Intent**, truyền dữ liệu bằng **Parcelable** và tích hợp tính năng chia sẻ thông tin sinh viên bằng **Implicit Intent**.

## Các tính năng chính
1. **Tuần tự hóa Parcelable:** Áp dụng `@Parcelize` đóng gói dữ liệu `Student` giúp truyền dữ liệu qua Intent tối ưu bộ nhớ.
2. **Explicit Intent:** Nhấn chọn sinh viên trong `RecyclerView` để chuyển sang màn hình `DetailActivity`.
3. **Hiển thị chi tiết sinh viên:** Giải nén dữ liệu `Student` an toàn (Null Safety & tương thích Android 13+) để hiển thị Avatar, Họ tên và MSSV.
4. **Implicit Intent (Chia sẻ):** Sử dụng `ACTION_SEND` kết hợp `Intent.createChooser` để chia sẻ thông tin sinh viên qua các ứng dụng bên ngoài.

## Ảnh minh chứng
<img width="675" height="866" alt="image" src="https://github.com/user-attachments/assets/83d02dfa-f9a3-4e25-881d-2bb525ad0a24" />
<img width="687" height="863" alt="image" src="https://github.com/user-attachments/assets/c33b1ed2-6b51-47c2-bd3c-b8e8bc270216" />

