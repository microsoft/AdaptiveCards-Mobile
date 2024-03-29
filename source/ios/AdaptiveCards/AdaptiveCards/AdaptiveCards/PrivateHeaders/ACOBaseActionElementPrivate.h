//
//  ACOBaseActionElementPrivate
//  ACOBaseActionElementPrivate.h
//
//  Copyright © 2017 Microsoft. All rights reserved.
//
#ifdef SWIFT_PACKAGE
/// Swift Package Imports
#import "ACOBaseActionElement.h"
#import "BaseActionElement.h"
#else
/// Cocoapods Imports
#import <AdaptiveCards/ACOBaseActionElement.h>
#import <AdaptiveCards/BaseActionElement.h>
#endif

using namespace AdaptiveCards;

@interface ACOBaseActionElement ()

- (instancetype)initWithBaseActionElement:(std::shared_ptr<BaseActionElement> const &)element;
- (std::shared_ptr<BaseActionElement>)element;
- (void)setElem:(std::shared_ptr<BaseActionElement> const &)elem;
+ (instancetype)getACOActionElementFromAdaptiveElement:(std::shared_ptr<BaseActionElement> const &)element;

@end
