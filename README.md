# QuestTugasUserInput_0263

Tugas Praktikum Pengembangan Aplikasi Mobile (PAM) - Implementasi Form Biodata Interaktif menggunakan **Jetpack Compose**.

---

## 📱 Hasil Tampilan Aplikasi (Preview / Running)

> *Tangkapan layar (screenshot) hasil running aplikasi dari emulator/device:*

![Screenshot Running](screenshot.png)

---

## 📌 Deskripsi Tugas

Aplikasi ini merupakan implementasi form input biodata pengguna dengan arsitektur modern berbasis Jetpack Compose dan Material 3. Tampilan dirancang dengan latar belakang bertema Neon Spider yang dipadukan dengan kontainer formulir melayang (*floating card*) di atas Scaffold.

### 📋 Komponen Input Form:
1. **Header Wallpaper**: Wallpaper neon spider bernuansa *electric blue* yang tajam dan responsif (`bagroundspider.png`).
2. **Form Biodata (`FormBiodata.kt`)**:
   - **Nama Depan & Nama Belakang**: Dua `OutlinedTextField` yang disusun berdampingan secara horizontal (`Row`).
   - **Email**: `OutlinedTextField` mandiri dengan tipe keyboard email.
   - **Tanggal Lahir**: `OutlinedTextField` dengan icon kalender di sisi kanan (`trailingIcon`).
   - **Experience**: Dropdown menu interaktif (`DropdownMenu`) dengan pilihan level pengalaman.
   - **Pilihan Skill**: Pilihan ganda menggunakan `Checkbox` untuk keahlian Android, UI/UX, dan Web.
   - **Tombol Proceed**: Tombol dinamis dengan validasi form otomatis.
   - **Bottom Divider**: Garis pembatas bawah dengan efek bayangan gradasi halus.

---

## 🛡️ Kepatuhan Aturan Tugas (Zero Hardcode & Architecture)

| No | Aturan Dosen | Status | Keterangan Implementasi |
|:--:|:-------------|:------:|:------------------------|
| 1 | **Seluruh Warna, Gambar, dan Kata masuk ke Resources** | ✅ Terpenuhi | • Semua teks menggunakan `stringResource(R.string.*)`<br>• Semua warna menggunakan `colorResource(R.color.*)`<br>• Gambar & icon menggunakan `painterResource(R.drawable.*)` |
| 2 | **Komponen Box mengapung di atas Scaffold** | ✅ Terpenuhi | Menggunakan kontainer `Card` dengan `shadow` dan `elevation` di atas layer wallpaper Scaffold. |
| 3 | **Tidak diizinkan Hardcode (Penalti -30%)** | ✅ Bebas Hardcode | Tidak ada satupun string teks atau kode warna hex yang ditulis langsung di file logika Kotlin. |
| 4 | **Layout Jetpack Compose** | ✅ Terpenuhi | 100% dibangun menggunakan komponen deklaratif Jetpack Compose & Material 3. |
| 5 | **File Terpisah & Modular** | ✅ Terpenuhi | Seluruh kode komponen form diletakkan di file terpisah `FormBiodata.kt`, dan `MainActivity.kt` bersih hanya memanggil layar utama. |
| 6 | **State-driven Form Validation Constraint** | ✅ Terpenuhi | Tombol *Proceed* berada dalam kondisi *disabled* (berwarna abu-abu) dan otomatis aktif berubah warna menjadi biru tema saat seluruh field dan minimal 1 skill telah diisi. |

---

## 🛠️ Tech Stack & Dependencies

- **Bahasa**: Kotlin
- **UI Framework**: Jetpack Compose (BOM)
- **Design System**: Material Design 3
- **Min SDK**: 24 (Android 7.0 Nougat)
- **Target SDK**: 36
- **Architecture**: Single Activity Compose (`ComponentActivity`) dengan modular Composable screen (`FormBiodata.kt`)

---

## 📂 Struktur File Utama

```
QuestTugasUserInput_0263/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/questtugasuserinput_0263/
│           │   ├── MainActivity.kt        # Entry point bersih yang memanggil FormBiodata
│           │   ├── FormBiodata.kt         # Logika UI, State, dan Composable Form
│           │   └── ui/theme/              # Konfigurasi Color, Theme, & Type
│           └── res/
│               ├── drawable/
│               │   ├── bagroundspider.png # Aset gambar wallpaper header neon
│               │   ├── ic_calendar.xml    # Vector icon kalender
│               │   └── ic_dropdown.xml    # Vector icon panah dropdown
│               └── values/
│                   ├── colors.xml         # Definisi seluruh warna aplikasi
│                   └── strings.xml        # Definisi seluruh teks aplikasi
└── README.md
```

---

## 👤 Identitas Mahasiswa

- **NIM**: 4 Digit Terakhir: `0263`
- **Repository**: `QuestTugasUserInput_0263`
