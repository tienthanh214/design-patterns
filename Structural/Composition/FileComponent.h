#pragma once
#include <string>

class FileComponent {
protected:
    std::string name;
public:
    FileComponent();
    FileComponent(std::string);
    virtual ~FileComponent();
public:
    virtual void showInfo() = 0;
};