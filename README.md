# 🚀 GitHub Actions CI/CD Pipeline for Java Spring Maven Project

A simple and effective CI/CD pipeline using **GitHub Actions** for Java Spring applications built with Maven. This guide will help you set up an automated workflow that builds your project and deploys the JAR to a remote server using **SCP**.

🌐 **Project URL**: [http://103.7.4.166:8081/](http://103.7.4.166:8081/)

---

## 🧩 Steps to Set Up CI/CD

### ✅ Step 1: Create GitHub Repository
- Initialize your Java Spring Maven project repository on GitHub.
- Select the branch where you want to enable CI/CD.

---

### ✅ Step 2: Create GitHub Actions Workflow
- Go to the **Actions** tab in your repository.
- Use the predefined template: `Publish Java Package with Maven`, or
- Create your own workflow file manually.

📁 Example workflow:  
[.github/workflows/github-ci-cd.yml](./.github/workflows/github-ci-cd.yml)

---

### ✅ Step 3: Copy CI/CD Script
- Copy the content from the provided `github-ci-cd.yml` file into your workflow directory:
